package com.example.demo.ComprasProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasProductosService {
    @Autowired
    private ComprasProductosRepository comprasProductosRepository;

    public List<ComprasProductos> findAll() {
        return comprasProductosRepository.findAll();
    }

    public Optional<ComprasProductos> findById(ComprasProductosId id) {
        return comprasProductosRepository.findById(id);
    }

    public ComprasProductos save(ComprasProductos comprasProductos) {
        return comprasProductosRepository.save(comprasProductos);
    }

    public void deleteById(ComprasProductosId id) {
        comprasProductosRepository.deleteById(id);
    }
}