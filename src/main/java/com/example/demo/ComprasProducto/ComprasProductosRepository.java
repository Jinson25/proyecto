package com.example.demo.ComprasProducto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasProductosRepository extends JpaRepository<ComprasProductos, ComprasProductosId> {
}
