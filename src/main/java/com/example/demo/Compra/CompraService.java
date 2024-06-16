package com.example.demo.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @SuppressWarnings("rawtypes")
    public List<Compra> findAll() {
        return compraRepository.findAll();
    }

    @SuppressWarnings("rawtypes")
    public Optional<Compra> findById(Long id) {
        return compraRepository.findById(id);
    }

    @SuppressWarnings("rawtypes")
    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }

    public void deleteById(Long id) {
        compraRepository.deleteById(id);
    }
}