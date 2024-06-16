package com.example.demo.Compra;

import java.security.Timestamp;
import java.util.List;

import com.example.demo.Cliente.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra<ComprasProductos> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compra;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    private Timestamp fecha;
    private char medio_pago;
    private String comentario;
    private char estado;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProductos> comprasProductos;

    // Getters y setters
    public Long getId_compra() {
        return id_compra;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public char getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(char medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public List<ComprasProductos> getComprasProductos() {
        return comprasProductos;
    }

    public void setComprasProductos(List<ComprasProductos> comprasProductos) {
        this.comprasProductos = comprasProductos;
    }
}
