package com.example.demo.Categoria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria save(Categoria categoria) {
        return (Categoria) categoriaRepository.save(categoria);
    }

    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
    public Optional<Categoria> findByName(String name) {
        return categoriaRepository.findByName(name);
    }
}
