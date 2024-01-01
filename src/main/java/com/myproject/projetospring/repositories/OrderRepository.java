package com.myproject.projetospring.repositories;

import com.myproject.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
