package com.pnc.loza.labo.repositories;

import com.pnc.loza.labo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = LocalRepository.class)
public interface LocalRepository extends JpaRepository<Local, Long> {
}

