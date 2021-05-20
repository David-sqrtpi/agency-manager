package com.david.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_Empleabilidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleabilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id", length = 11)
    private int id;
    @ManyToOne
    @Column(name="IdAspirante", length = 11, columnDefinition = "integer")
    private Aspirante aspirante;
    @ManyToOne
    @Column(name="IdOferta", length = 11, columnDefinition = "integer")
    private Oferta oferta;
    @Column(name = "eFecha")
    private Date date;
}