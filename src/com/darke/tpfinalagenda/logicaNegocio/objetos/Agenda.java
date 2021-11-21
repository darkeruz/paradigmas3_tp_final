/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.objetos;

import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author darke
 */
public class Agenda {
    private int id;
    private String fecha;
    private String hora;
    private Locacion locacion;
    private TipoEvento tipoevento;
    private Persona persona;
    private Anfitrion anfitrion;

    public Agenda() {
        
    }

    public Agenda(int id, String fecha, String hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Agenda(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    
    ArrayList<Persona> listaInvitados = new ArrayList<>();

    public int sizeInvitados() {
        return listaInvitados.size();
    }

    public boolean addInvitado(Persona invitado) {
        return listaInvitados.add(invitado);
    }

    public boolean removeInvitado(Persona invitado) {
        return listaInvitados.remove(invitado);
    }

    public void clearInvitados() {
        listaInvitados.clear();
    }
    
        ArrayList<Anfitrion> listaAnfitrion = new ArrayList<>();

    public int sizeAnfitrion() {
        return listaAnfitrion.size();
    }

    public boolean addAnfitrion(Anfitrion anfitrion) {
        return listaAnfitrion.add(anfitrion);
    }

    public boolean removeAnfitrion(Anfitrion anfitrion) {
        return listaAnfitrion.remove(anfitrion);
    }

    public void clearAnfitrion() {
        listaAnfitrion.clear();
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Locacion getLocacion() {
        return locacion;
    }

    public void setLocacion(Locacion locacion) {
        this.locacion = locacion;
    }

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(TipoEvento tipoevento) {
        this.tipoevento = tipoevento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Anfitrion getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }

    public ArrayList<Persona> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Persona> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public ArrayList<Anfitrion> getListaAnfitrion() {
        return listaAnfitrion;
    }

    public void setListaAnfitrion(ArrayList<Anfitrion> listaAnfitrion) {
        this.listaAnfitrion = listaAnfitrion;
    }
    
    
}
