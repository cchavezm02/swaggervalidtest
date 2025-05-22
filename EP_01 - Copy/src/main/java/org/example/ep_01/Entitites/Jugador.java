package org.example.ep_01.Entitites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jid;
    @Column(name = "Name",length = 50,nullable = false)
    private String name;
    @Column(name = "PlayedGames",length = 50,nullable = false)
    private int playedgames;
    @Column(name = "BirthDate",length = 50,nullable = false)
    private LocalDate birthdate;
    @Column(name = "Position",length = 50,nullable = false)
    private String position;
    @ManyToOne
    @JoinColumn(name = "tid",nullable = false)
    private Entrenador entrenador;

    public Jugador() {
    }

    public Jugador(long jid, String name, int playedgames, LocalDate birthdate, String position, Entrenador entrenador) {
        this.jid = jid;
        this.name = name;
        this.playedgames = playedgames;
        this.birthdate = birthdate;
        this.position = position;
        this.entrenador = entrenador;
    }

    public long getId() {
        return jid;
    }

    public void setId(long jid) {
        this.jid = jid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayedgames() {
        return playedgames;
    }

    public void setPlayedgames(int playedgames) {
        this.playedgames = playedgames;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Entrenador getJugador() {
        return entrenador;
    }

    public void setJugador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}
