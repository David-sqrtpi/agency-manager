package com.david.application.repository;

import com.david.application.entity.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAgencia extends JpaRepository<Agencia, Integer> {
    Agencia findById(int id);
}
