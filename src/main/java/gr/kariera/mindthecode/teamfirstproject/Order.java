package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Float discount;


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

