package com.example.demo.Categoria;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("rawtypes")
public interface CategoriaRepository<C extends Categoria> extends JpaRepository<C, Long> {
    Optional<C> findByName(String name);
}

