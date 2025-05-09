package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = EmpleadoRepository.class)
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
