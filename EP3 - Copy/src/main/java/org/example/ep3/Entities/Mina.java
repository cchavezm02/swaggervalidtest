package org.example.ep3.Entities;

import jakarta.persistence.*;

@Entity
public class Mina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
    @Column(name = "Name", length = 50, nullable = false)
    private String name;
    @Column(name = "WorkForce", length = 50, nullable = false)
    private int workForce;
    @Column(name = "State", length = 50, nullable = false)
    private boolean state;
    @ManyToOne
    @JoinColumn(name = "eid", nullable = false)
    private Empresa empresa;

    public Mina() {
    }

    public Mina(Long mid, String name, int workForce, boolean state, Empresa empresa) {
        this.mid = mid;
        this.name = name;
        this.workForce = workForce;
        this.state = state;
        this.empresa = empresa;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkForce() {
        return workForce;
    }

    public void setWorkForce(int workForce) {
        this.workForce = workForce;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
