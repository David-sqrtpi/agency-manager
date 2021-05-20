package com.david.application.services;

import com.david.application.entity.Aspirante;
import com.david.application.repository.RepositorioAspirante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAspirante {
    @Autowired
    private RepositorioAspirante repositorioAspirante;

    //RF2
    public void addCandidate(Aspirante aspirante) {
        try {
            repositorioAspirante.save(aspirante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //RF3
    public List<Aspirante> filterByFirstNameLetter(char letter) {
        return repositorioAspirante.findByNameLike(letter+"%");
    }

    //RF4
    public List<Aspirante> filterByGenderAndProfession(String gender, String profession) {
        return null;
    }

    //RF5
    public Aspirante filterByHigherAge(){
        return null;
    }

    //RF6
    public Aspirante listByGenderAndProfession(){
        return null;
    }

    //RF9
    public List<Aspirante> filterByProffesion(String proffesion) {
        return null;
    }
}
