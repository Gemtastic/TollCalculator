package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TollRate {

    private Integer rate;
    private String name;
    private LocalTime validFrom;
    private LocalTime vadidThrough;

    public TollRate() {
    }

    public TollRate(Integer rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalTime getVadidThrough() {
        return vadidThrough;
    }

    public void setVadidThrough(LocalTime vadidThrough) {
        this.vadidThrough = vadidThrough;
    }
}
