package com.example.testspringboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;
    private String libelle;
    private String description;
}
