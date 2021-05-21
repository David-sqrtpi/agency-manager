package com.david.application.services;

import com.david.application.entity.Oferta;
import com.david.application.repository.ReposirorioOferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class ServicioOferta {
    @Autowired
    private ReposirorioOferta reposirorioOferta;

    //RF8
    public void create(Oferta oferta) {
        oferta.setEndDate(new Date(oferta.getStartDate().getTime() + (5*86400*1000))); //End date is 5 days later (in ms)
    }

    public boolean isExpired(Oferta oferta) {
        Oferta oferta1 = reposirorioOferta.findById(oferta.getId());
        return oferta1.getEndDate().before(new java.util.Date());
    }
}
