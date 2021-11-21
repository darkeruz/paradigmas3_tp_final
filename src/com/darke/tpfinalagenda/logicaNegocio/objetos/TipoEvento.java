/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.objetos;

/**
 *
 * @author darke
 */
public class TipoEvento {
    private int id;
    private int id_agenda;
    private String nombre;
    private boolean estado;

    public TipoEvento() {
    }

    public TipoEvento(int id_agenda, String nombre, boolean estado) {
        this.id_agenda = id_agenda;
        this.nombre = nombre;
        this.estado = estado;
    }

    public TipoEvento(String nombre, boolean estado) {
        this.nombre = nombre;
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
        return "TipoEvento{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
