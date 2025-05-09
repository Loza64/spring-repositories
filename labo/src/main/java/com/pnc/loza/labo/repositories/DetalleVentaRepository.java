package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = DetalleVentaRepository.class)
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
