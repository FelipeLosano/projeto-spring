package com.myproject.projetospring.repositories;

import com.myproject.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
