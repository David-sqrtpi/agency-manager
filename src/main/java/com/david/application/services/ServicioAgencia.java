package com.david.application.services;

import com.david.application.entity.Agencia;
import com.david.application.repository.RepositorioAgencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAgencia {
    @Autowired
    private RepositorioAgencia repositorioAgencia;

    //RF1
    public void initializeAgencyValues(Agencia agencia) {
        repositorioAgencia.save(agencia);
    }
}
