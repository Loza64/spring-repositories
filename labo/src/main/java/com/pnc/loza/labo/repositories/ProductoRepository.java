package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = ProductoRepository.class)
public interface ProductoRepository extends JpaRepository<Modelo, Long> {
}
