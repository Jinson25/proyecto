package com.example.demo.ComprasProducto;

import java.io.Serializable;

public class ComprasProductosId implements Serializable {
    private Long id_compra;
    private Long id_producto;

    // Getters, setters, hashCode y equals
    public Long getId_compra() {
        return id_compra;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }
}
