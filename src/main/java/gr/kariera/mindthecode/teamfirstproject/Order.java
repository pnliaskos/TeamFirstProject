package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Float discount;
    @ManyToMany
    Set<Product> orderProducts;
// getters setters
}
