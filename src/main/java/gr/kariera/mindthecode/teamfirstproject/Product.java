package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private Float price;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
