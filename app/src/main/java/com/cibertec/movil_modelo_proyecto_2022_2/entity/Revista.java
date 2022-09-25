package com.cibertec.movil_modelo_proyecto_2022_2.entity;

import java.util.Date;

public class Revista {
    private int idRevista;
    private String nombre;
    private String frecuencia;
    private String fechaCreacion;
    private String fechaRegistro;
    private int estado;
    private Modalidad modalidad;

    public Revista() {
    }

    public Revista(int idRevista, String nombre, String frecuencia, String fechaCreacion, String fechaRegistro, int estado, Modalidad modalidad) {
        this.idRevista = idRevista;
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.fechaCreacion = fechaCreacion;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.modalidad = modalidad;
    }

    public int getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(int idRevista) {
        this.idRevista = idRevista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
}
