package com.david.application.services;

import com.david.application.entity.Empleabilidad;
import com.david.application.repository.RepositorioEmpleabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleabilidad {
    @Autowired
    private RepositorioEmpleabilidad repositorioEmpleabilidad;
    @Autowired
    private ServicioOferta servicioOferta;

    //RF7
    public void apply(Empleabilidad empleabilidad) {
        if(!repositorioEmpleabilidad.existsByAspiranteId(empleabilidad.getAspirante().getId())
                && !servicioOferta.isExpired(empleabilidad.getOferta())) {
            //Save candidate's application only if the candidate has not applied to any offer and the offer is not expired
            repositorioEmpleabilidad.save(empleabilidad);
        }
    }
}
