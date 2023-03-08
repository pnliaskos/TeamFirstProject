package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

@Entity
public class OrderProduct {

    @EmbeddedId
    private Order orderId;

    @EmbeddedId
    private Product productId;

    private Integer quantity;

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
