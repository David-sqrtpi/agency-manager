package com.david.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_Oferta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdOferta", length = 11)
    private int id;
    @Column(name="O_Nombre", length = 50)
    private String name;
    @Column(name="O_Descripcion", columnDefinition = "TEXT")
    private String description;
    @Column(name="O_Fecha_inicio")
    private Date startDate;
    @Column(name="O_Fecha_fin")
    private Date endDate;
}
