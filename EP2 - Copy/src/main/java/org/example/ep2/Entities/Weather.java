package org.example.ep2.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wid;
    @Column(name= "localdate", length = 50, nullable = false)
    private LocalDate localDate;
    @Column(name= "temperature", length = 50, nullable = false)
    private double temperature;
    @Column(name= "description", length = 50, nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private City city;

    public Weather() {
    }

    public Weather(Long wid, LocalDate localDate, double temperature, String description, City city) {
        this.wid = wid;
        this.localDate = localDate;
        this.temperature = temperature;
        this.description = description;
        this.city = city;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
