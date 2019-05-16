package model;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@Entity
@Table(name = "checkpoint")
@XmlRootElement(name="checkpoint")
@JsonRootName(value = "checkpoint")
public class Checkpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "vehicle_id")
    private Vehicle vehicle;

    @NotNull
    @Column(name = "passthrough")
    private LocalDateTime passthrough;

    @NotNull
    @Column(name = "toll_rate_id")
    private TollRate tollRate;

    public Checkpoint() {
    }

    public Checkpoint(Integer id, Vehicle vehicle, LocalDateTime passthrough) {
        this.vehicle = vehicle;
        this.passthrough = passthrough;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
