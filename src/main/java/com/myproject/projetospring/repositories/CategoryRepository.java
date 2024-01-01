package com.myproject.projetospring.repositories;

import com.myproject.projetospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
