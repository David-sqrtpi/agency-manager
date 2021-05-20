package com.david.application.services;

import com.david.application.repository.RepositorioEmpleabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleabilidad {
    @Autowired
    private RepositorioEmpleabilidad repositorioEmpleabilidad;

    //RF7
    private boolean existsByCandidateAndOffer(String candidate, String offer){
        return false;
    }
}
