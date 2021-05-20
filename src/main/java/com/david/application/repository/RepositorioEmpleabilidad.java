package com.david.application.repository;

import com.david.application.entity.Empleabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleabilidad extends JpaRepository<Empleabilidad, Integer> {

}
