package gr.kariera.mindthecode.teamfirstproject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {
    private final OrderRepo repo;

    public OrderController(OrderRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    public Order newOrder(@RequestBody Order order) {
        return repo.save(order);
    }

}
