package gr.kariera.mindthecode.teamfirstproject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    Page<Product> findById(Integer id, Pageable pageable);
}
