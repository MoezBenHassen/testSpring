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
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private String libelle;
    private String description;
    private Date dateEvent;
    private String nbParticipants;

    // an event can have one responsable, using mappedBy to specify that the relation is bidirectional
    @ManyToOne(cascade = CascadeType.ALL)
    private Utilisateur responsable;

    //an event can have many participants bidirectionally
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "evenementsParticipes")
    private Set<Utilisateur> participants;
}
