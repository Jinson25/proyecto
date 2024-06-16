package com.example.demo.Categoria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @SuppressWarnings("rawtypes")
    @Autowired
    private CategoriaRepository categoriaRepository;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Categoria save(Categoria categoria) {
        return (Categoria) categoriaRepository.save(categoria);
    }

    @SuppressWarnings("unchecked")
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}