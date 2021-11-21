/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.objetos;

/**
 *
 * @author darke
 */
public class Persona {
    private int id;
    private int id_agenda;
    private String apellido;
    private String nombre;

    public Persona() {
    }

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Persona(int id_agenda, String apellido, String nombre) {
        this.id_agenda = id_agenda;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
}
