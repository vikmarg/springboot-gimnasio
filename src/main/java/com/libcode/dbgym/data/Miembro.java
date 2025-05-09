package com.libcode.dbgym.data;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;

    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<Membresia> membresias = new ArrayList<>();

    @ManyToOne
    private Membresia membresiaActiva;

    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<AsistenciaClase> asistencias = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Membresia> getMembresias() {
        return membresias;
    }

    public void setMembresias(List<Membresia> membresias) {
        this.membresias = membresias;
    }

    public Membresia getMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(Membresia membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }

    public List<AsistenciaClase> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<AsistenciaClase> asistencias) {
        this.asistencias = asistencias;
    }

}

