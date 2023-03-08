package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Embeddable
public class Order implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Float discount;

    public Order(Integer id, Float discount) {
        this.id = id;
        this.discount = discount;
    }

    public Order() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}

