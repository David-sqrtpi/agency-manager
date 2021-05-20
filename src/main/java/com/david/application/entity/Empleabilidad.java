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
    @JoinColumn(name="IdAspirante", columnDefinition = "integer(11)")
    private Aspirante aspirante;
    @ManyToOne
    @JoinColumn(name="IdOferta", columnDefinition = "integer(11)")
    private Oferta oferta;
    @Column(name = "eFecha")
    private Date date;
}