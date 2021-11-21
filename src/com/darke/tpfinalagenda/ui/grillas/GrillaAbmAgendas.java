/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darke.tpfinalagenda.ui.grillas;

import com.darke.tpfinalagenda.logicaNegocio.controladores.AnfitrionControlador;
import com.darke.tpfinalagenda.logicaNegocio.controladores.LocacionControlador;
import com.darke.tpfinalagenda.logicaNegocio.controladores.PersonaControlador;
import com.darke.tpfinalagenda.logicaNegocio.controladores.TipoEventoControlador;
import com.darke.tpfinalagenda.logicaNegocio.objetos.Agenda;
import com.darke.tpfinalagenda.logicaNegocio.objetos.Anfitrion;
import com.darke.tpfinalagenda.logicaNegocio.objetos.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Darkeruz
 */
public class GrillaAbmAgendas extends AbstractTableModel {

    public GrillaAbmAgendas() {
    }
    
    private ArrayList<Agenda> agendas = new ArrayList<>();
    
    public GrillaAbmAgendas(ArrayList<Agenda> datos){
        this.agendas = datos;
    }
    @Override
    public int getRowCount() {
        return agendas.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Agenda agenda = agendas.get(rowIndex);
        
        switch(columnIndex){
            case 0: return agenda.getId();
            case 1:{
                AnfitrionControlador anfiControlador = new AnfitrionControlador();
                ArrayList<String> anfitriones = new ArrayList<>();
                anfitriones = anfiControlador.extraerApellidos(agenda.getId());
                return anfitriones;
            } 
            case 2: return agenda.getFecha();
            case 3: return agenda.getHora();
            case 4:{
                PersonaControlador personaControlador = new PersonaControlador();
                ArrayList<String> invitados = new ArrayList<>();
                invitados = personaControlador.extraerApellidos(agenda.getId());
                return invitados;
            }
            case 5:{
                LocacionControlador locacionControlador = new LocacionControlador();
                Set<String> locaciones = new HashSet<>();
                locaciones = locacionControlador.extraerDatos(agenda.getId());
                return locaciones;
            } 
            case 6:{
                TipoEventoControlador tipoEventoControlador = new TipoEventoControlador();
                Set<String> tiposEventos = new HashSet<>();
                tiposEventos = tipoEventoControlador.extraerDatos(agenda.getId());
                return tiposEventos;
            } 
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column){
            case 0: return "ID";
            case 1: return "Anfitrión";
            case 2: return "Fecha";
            case 3: return "Hora";
            case 4: return "Lista de Invitados";
            case 5: return "Locación";
            case 6: return "Tipo de Evento";
            default: return "";
        }
        
    }
    
}
