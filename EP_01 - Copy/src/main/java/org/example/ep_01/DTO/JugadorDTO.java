package org.example.ep_01.DTO;


import org.example.ep_01.Entitites.Entrenador;
import org.example.ep_01.Entitites.Jugador;

import java.time.LocalDate;

public class JugadorDTO {
    private long jid;
    private String name;
    private int playedgames;
    private LocalDate birthdate;
    private String position;
    private Entrenador entrenador;

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
