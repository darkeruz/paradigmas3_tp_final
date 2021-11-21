/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.objetos;

/**
 *
 * @author darke
 */
public class Locacion {
    private int id;
    private int id_agenda;
    private String nombre;
    private String domicilio;
    private boolean estado;

    public Locacion() {
    }
    
    

    public Locacion(int id_agenda, String nombre, String domicilio, boolean estado) {
        this.id_agenda = id_agenda;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public Locacion(String nombre, String domicilio, boolean estado) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.estado = estado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }
    
    

    @Override
    public String toString() {
        return "Locacion{" + "id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", estado=" + estado + '}';
    }
    
    
    
}
