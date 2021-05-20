package com.david.application.repository;

import com.david.application.entity.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposirorioOferta extends JpaRepository<Oferta, Integer> {
}
