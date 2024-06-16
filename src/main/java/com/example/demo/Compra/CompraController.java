package com.example.demo.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @SuppressWarnings("rawtypes")
    @GetMapping
    public List<Compra> findAll() {
        return compraService.findAll();
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/{id}")
    public ResponseEntity<Compra> findById(@PathVariable Long id) {
        Optional<Compra> compra = compraService.findById(id);
        return compra.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @SuppressWarnings("rawtypes")
    @PostMapping
    public Compra save(@RequestBody Compra compra) {
        return compraService.save(compra);
    }

    @SuppressWarnings("rawtypes")
    @PutMapping("/{id}")
    public ResponseEntity<Compra> update(@PathVariable Long id, @RequestBody Compra compra) {
        if (!compraService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        compra.setId_compra(id);
        return ResponseEntity.ok(compraService.save(compra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if (!compraService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        compraService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}