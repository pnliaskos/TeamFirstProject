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
// getters and setters
}
