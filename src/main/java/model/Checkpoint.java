package model;

import java.time.LocalDateTime;

public class Checkpoint {

    private Vehicle vehicle;
    private LocalDateTime passthrough;
    private TollRate tollRate;

    public Checkpoint() {
    }

    public Checkpoint(Vehicle vehicle, LocalDateTime passthrough) {
        this.vehicle = vehicle;
        this.passthrough = passthrough;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getPassthrough() {
        return passthrough;
    }

    public void setPassthrough(LocalDateTime passthrough) {
        this.passthrough = passthrough;
    }

    public TollRate getTollRate() {
        return tollRate;
    }

    public void setTollRate(TollRate tollRate) {
        this.tollRate = tollRate;
    }
}
