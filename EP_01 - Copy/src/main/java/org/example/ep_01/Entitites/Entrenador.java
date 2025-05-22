package org.example.ep_01.Entitites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tid;
    @Column(name = "Name",length = 50,nullable = false)
    private String name;
    @Column(name = "Country",length = 50,nullable = false)
    private String country;
    @Column(name = "HiringDate",length = 50,nullable = false)
    private LocalDate hiringDate;
    @Column(name = "Salary",length = 50,nullable = false)
    private String salary;

    public Entrenador() {
    }

    public Entrenador(long tid, String name, String country, LocalDate hiringDate, String salary) {
        this.tid = tid;
        this.name = name;
        this.country = country;
        this.hiringDate = hiringDate;
        this.salary = salary;
    }

    public long getId() {
        return tid;
    }

    public void setId(long tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
