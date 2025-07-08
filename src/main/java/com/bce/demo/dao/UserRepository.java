package com.bce.demo.dao;
import com.bce.demo.controllers.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Aquí puedes definir métodos personalizados si es necesario
    // Por ejemplo, para buscar usuarios por nombre:
    // List<User> findByName(String name);  

}
