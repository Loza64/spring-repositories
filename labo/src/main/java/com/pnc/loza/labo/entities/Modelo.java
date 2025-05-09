package com.pnc.loza.labo.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private BigDecimal costo;

    @Column(nullable = false)
    private BigDecimal precioVenta;

    @OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL)
    private List<Inventario> inventarios;

    @OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL)
    private List<DetalleVenta> detallesVenta;

}