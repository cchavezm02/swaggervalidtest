package org.example.ep3.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.ep3.Entities.Empresa;

public class MinaDTO {
    private Long mid;
    private String name;
    private int workForce;
    private boolean state;
    private Empresa empresa;

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
