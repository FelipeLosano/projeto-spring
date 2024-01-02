package com.myproject.projetospring.repositories;

import com.myproject.projetospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
