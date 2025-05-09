package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = VentaRepository.class)
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
