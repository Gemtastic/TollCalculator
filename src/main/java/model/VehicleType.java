package model;

public class VehicleType {
    private String type;
    private Boolean tollable;

    public VehicleType() {

    }

    public VehicleType(String type, Boolean tollable) {
        this.type = type;
        this.tollable = tollable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getTollable() {
        return tollable;
    }

    public void setTollable(Boolean tollable) {
        this.tollable = tollable;
    }
}
