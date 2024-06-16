package com.example.demo.Cliente;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

public class Cliente {
    
    
@Entity
@Table(name = "clientes")
public class cliente<Compra> {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private BigDecimal celular;
    private String direccion;
    private String correo_electronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public BigDecimal getCelular() {
        return celular;
    }

    public void setCelular(BigDecimal celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}

public void setId(String id) {
    throw new UnsupportedOperationException("Unimplemented method 'setId'");
}
}