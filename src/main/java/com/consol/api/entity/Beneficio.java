package com.consol.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beneficio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_beneficio")
    private Integer id;

    private String nome;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "fk_titular")
    private Titular titular;
}
