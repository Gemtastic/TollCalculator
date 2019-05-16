package model;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "vehicle")
@XmlRootElement(name="vehicle")
@JsonRootName(value = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "type")
    private VehicleType type;

    @NotNull
    @Column(name = "license_plate")
    private String licencePlate;

    public Vehicle() {
    }

    public Vehicle(Integer id, VehicleType type, String licencePlate) {
        this.id = id;
        this.type = type;
        this.licencePlate = licencePlate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
