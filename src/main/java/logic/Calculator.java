package logic;

import model.Checkpoint;
import model.TollRate;
import model.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    TollTableHelper tollTableHelper = new TollTableHelper();

    public int setTollRate(Checkpoint checkpoint) {
        List<TollRate> rates = TollTableHelper.getTollRates();
        for(TollRate rate : rates) {
            boolean match = checkpoint.getPassthrough().toLocalTime().compareTo(rate.getValidFrom()) >= 0 && checkpoint.getPassthrough().toLocalTime().compareTo(rate.getVadidThrough()) <= 0;
            if(match) {
                return rate.getRate();
            }
        }
        return 0;
    }

    public boolean isWithinTheHour(LocalDateTime lastToll, LocalDateTime currentToll) {
        if(lastToll == null) {
            return false;
        }
        if(lastToll.equals(currentToll)) {
            return false;
        }

        int comapred = lastToll.plusHours(1).compareTo(currentToll);
        boolean withinTheHour = comapred <= 0;
        return withinTheHour;
    }

    public int getMonthlyTollFee(Vehicle vehicle) {
        List<Checkpoint> checkpoints = tollTableHelper.getCheckpoints(vehicle);
        List<Checkpoint> tollableCkeckpoints = getTollableCheckpoints(checkpoints);

        return calculateTolls(tollableCkeckpoints);
    }

    public List<Checkpoint> getTollableCheckpoints(List<Checkpoint> checkpoints) {
        List<Checkpoint> tollableCheckpoints = new ArrayList<>();
        for(Checkpoint checkpoint : checkpoints) {

            Checkpoint lastCheckpoint;

            if(tollableCheckpoints.isEmpty()){
                lastCheckpoint = tollableCheckpoints.get(tollableCheckpoints.size() - 1);
            } else {
                lastCheckpoint = checkpoint;
            }

            if(!isWithinTheHour(lastCheckpoint.getPassthrough(), checkpoint.getPassthrough())) {
                tollableCheckpoints.add(checkpoint);
            }
        }
        return tollableCheckpoints;
    }


    public int calculateTolls(List<Checkpoint> checkpoints) {
        int tollFee = 0;
        for(Checkpoint checkpoint : checkpoints) {
            if(checkpoint.getVehicle().getType().getTollable()) {
                tollFee += checkpoint.getTollRate().getRate();
            }
        }
        return tollFee;
    }
}
