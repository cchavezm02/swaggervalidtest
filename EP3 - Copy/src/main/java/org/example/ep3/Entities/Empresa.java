package org.example.ep3.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    @Column(name = "RazonSocial", length = 50, nullable = false)
    private String razonSocial;
    @Column(name = "RUC", length = 50, nullable = false)
    private String ruc;
    @Column(name = "Pais", length = 50, nullable = false)
    private String pais;
    @Column(name = "FechaRegistro", length = 50, nullable = false)
    private LocalDate fecharegistro;

    public Empresa() {
    }

    public Empresa(Long eid, String razonSocial, String ruc, String pais, LocalDate fecharegistro) {
        this.eid = eid;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.pais = pais;
        this.fecharegistro = fecharegistro;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDate fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
}
