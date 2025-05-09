package com.pnc.loza.labo.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Embeddable
public class InventarioId implements Serializable {
    private Long localId;
    private Long modeloId;
}
