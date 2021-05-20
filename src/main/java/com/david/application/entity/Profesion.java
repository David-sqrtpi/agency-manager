package com.david.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_Profesion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profesion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdProfesion", length = 11)
    private int id;
    @Column(name="P_Nombre", length = 20)
    private String name;
}