package com.david.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_Aspirante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aspirante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdAspirante", length = 11)
    private int id;
    @Column(name="AS_Nombre", length = 50)
    private String name;
    @Column(name="AS_Edad", length = 2)
    private int age;
    @Column(name="AS_Genero", length = 1)
    private int gender;
    @ManyToOne
    @Column(name="IdProfesion", length = 11, columnDefinition = "integer")
    private Profesion profesion;
    @ManyToOne
    @Column(name="IdAgencia", length = 11, columnDefinition = "integer")
    private Agencia agencia;
}