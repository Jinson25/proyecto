package com.example.demo.Categoria;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByName(String name);
}

