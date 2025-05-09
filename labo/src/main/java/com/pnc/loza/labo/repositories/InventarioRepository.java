package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.Inventario;
import com.pnc.loza.labo.entities.InventarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = InventarioRepository.class)
public interface InventarioRepository extends JpaRepository<Inventario, InventarioId> {
}
