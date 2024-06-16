package com.example.demo.ComprasProducto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compras-productos")
public class ComprasProductosController {
    @Autowired
    private ComprasProductosService comprasProductosService;

  /**
 * @return
 */
@GetMapping
public List<ComprasProductos> findAll() {
    return comprasProductosService.findAll();
}

    @GetMapping("/{id_compra}/{id_producto}")
    public ResponseEntity<ComprasProductos> findById(@PathVariable Long id_compra, @PathVariable Long id_producto) {
        ComprasProductosId id = new ComprasProductosId();
        id.setId_compra(id_compra);
        id.setId_producto(id_producto);
        Optional<ComprasProductos> comprasProductos = comprasProductosService.findById(id);
        return comprasProductos.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ComprasProductos> save(@RequestBody ComprasProductos comprasProductos) {
        ComprasProductos saved = comprasProductosService.save(comprasProductos);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id_compra}/{id_producto}")
public ResponseEntity<ComprasProductos> update(@PathVariable Long id_compra, @PathVariable Long id_producto, @RequestBody ComprasProductos comprasProductos) {
    ComprasProductosId id = new ComprasProductosId();
    id.setId_compra(id_compra);
    id.setId_producto(id_producto);

    Optional<ComprasProductos> existing = comprasProductosService.findById(id);
    if (!existing.isPresent()) {
        return ResponseEntity.notFound().build();
    }

    comprasProductos.setId_compra(id_compra);
    comprasProductos.setId_producto(id_producto);
    ComprasProductos updated = comprasProductosService.save(comprasProductos);
    return ResponseEntity.ok(updated);
}

@DeleteMapping("/{id_compra}/{id_producto}")
public ResponseEntity<Void> deleteById(@PathVariable Long id_compra, @PathVariable Long id_producto) {
    ComprasProductosId id = new ComprasProductosId();
    id.setId_compra(id_compra);
    id.setId_producto(id_producto);

    Optional<ComprasProductos> existing = comprasProductosService.findById(id);
    if (!existing.isPresent()) {
        return ResponseEntity.notFound().build();
    }

    comprasProductosService.deleteById(id);
    return ResponseEntity.noContent().build();
}
}