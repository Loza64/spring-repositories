package com.pnc.loza.labo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "inventario")
public class Inventario {
    @EmbeddedId
    private InventarioId id;

    @ManyToOne
    @MapsId("localId")
    @JoinColumn(name = "local_id")
    private Local local;

    @ManyToOne
    @MapsId("modeloId")
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @Column(nullable = false)
    private Integer cantidad;

}

