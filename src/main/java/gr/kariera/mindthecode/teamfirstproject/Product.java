package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.Set;


@Embeddable
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Float price;
    private String description;

    public Product(Integer id, Float price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public Product() {

    }


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
