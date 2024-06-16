package com.example.demo.Compra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
}
