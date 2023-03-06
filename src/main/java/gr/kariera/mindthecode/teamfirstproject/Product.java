package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private Float price;
    private String description;

    @ManyToMany
    Set<Order> productOrders;

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

    public Set<Order> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(Set<Order> productOrders) {
        this.productOrders = productOrders;
    }
}
