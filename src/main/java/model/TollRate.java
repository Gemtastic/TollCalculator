package model;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalTime;

@Entity
@Table(name = "toll_rate")
@XmlRootElement(name="toll_rate")
@JsonRootName(value = "toll_rate")
public class TollRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "rate")
    private Integer rate;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "valid_from")
    private LocalTime validFrom;

    @NotNull
    @Column(name = "valid_through")
    private LocalTime vadidThrough;

    public TollRate() {
    }

    public TollRate(Integer rate, String name, LocalTime validFrom, LocalTime vadidThrough) {
        this.rate = rate;
        this.name = name;
        this.validFrom = validFrom;
        this.vadidThrough = vadidThrough;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
