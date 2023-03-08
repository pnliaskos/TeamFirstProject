package gr.kariera.mindthecode.teamfirstproject;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer>{
        Page<Order> findById(Integer id, Pageable pageable);
}
