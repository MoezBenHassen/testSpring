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
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU;
    private String nom;
    private String prenom;
    private Long numTelephone;

    @Enumerated(EnumType.STRING)
    private Role role;

//a responsable user can have many events bidirectionally
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "responsable")
    private Set<Evenement> evenements;

    //a participant user can have many activities bidirectionally, event is the child
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Evenement> evenementsParticipes;

}
