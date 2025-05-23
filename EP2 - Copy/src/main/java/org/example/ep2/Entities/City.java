package org.example.ep2.Entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cityname", length = 50, nullable = false)
    private String cityName;
    @Column(name = "countrycode", length = 50, nullable = false)
    private int countrycode;

    public City() {
    }

    public City(Long id, String cityName, int countrycode) {
        this.id = id;
        this.cityName = cityName;
        this.countrycode = countrycode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }
}
