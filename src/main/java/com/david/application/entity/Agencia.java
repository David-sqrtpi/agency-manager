package com.david.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_Agencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdAgencia", length = 11)
    private int id;
    @Column(name="AG_Nombre", length = 50)
    private String name;
    @Column(name="AG_Telefono", length = 16)
    private String phone;
    @Column(name="AG_Direccion", length = 50)
    private String address;
}

    /*create database agency;
    mysql> create user 'root'@'%' identified by 'strongerPassword123';
    mysql> grant all on agency.* to 'root'@'%';*/