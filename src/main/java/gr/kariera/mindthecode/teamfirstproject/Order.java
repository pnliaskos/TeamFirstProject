package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Float discount;
    @ManyToMany
     @JoinTable(
             name = "product_ordered",
             joinColumns = @JoinColumn (name = "order_id"),
             inverseJoinColumns = @JoinColumn (name = "product_id")
     )
    Set<Product> orderProducts;

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

    public Set<Product> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<Product> orderProducts) {
        this.orderProducts = orderProducts;
    }
}
