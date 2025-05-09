package com.pnc.loza.labo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "local")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Inventario> inventarios;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Venta> ventas;

    // Getters y Setters
}