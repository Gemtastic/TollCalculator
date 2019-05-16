package model;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "vehicle_type")
@XmlRootElement(name="vehicle_type")
@JsonRootName(value = "vehicle_type")
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "type")
    private String type;

    @NotNull
    @Column(name = "tollable")
    private Boolean tollable;

    public VehicleType() {

    }

    public VehicleType(Integer id, String type, Boolean tollable) {
        this.id = id;
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
