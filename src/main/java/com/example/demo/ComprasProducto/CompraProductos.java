package com.example.demo.ComprasProducto;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

import com.example.demo.Compra.Compra;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra_productos")
@IdClass(ComprasProductosId.class)
public class CompraProductos {
    @Id
    private Long id_compra;
    @Id
    private Long id_producto;
    private int cantidad;
    private BigDecimal total;
    private int estado;


    @SuppressWarnings("rawtypes")
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producer producto;

    // Getters y setters
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @SuppressWarnings("rawtypes")
    public Compra getCompra() {
        return compra;
    }

    @SuppressWarnings("rawtypes")
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producer getProducto() {
        return producto;
    }

    public void setProducto(Producer producto) {
        this.producto = producto;
    }
}
