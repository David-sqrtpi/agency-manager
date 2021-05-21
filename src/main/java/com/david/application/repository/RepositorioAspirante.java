package com.david.application.repository;

import com.david.application.entity.Aspirante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioAspirante extends JpaRepository<Aspirante, Integer> {
    List<Aspirante> findByNameLike(String pattern);
    List<Aspirante> findByGenderAndProfesionId(char gender, int profesionId);
}