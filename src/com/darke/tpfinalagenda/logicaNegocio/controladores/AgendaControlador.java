/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import com.darke.tpfinalagenda.logicaNegocio.objetos.Agenda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author darke
 */
public class AgendaControlador implements IBaseControlador<Agenda, Integer>{

    @Override
    public ArrayList<Agenda> extraerTodos() {
        String sql = "SELECT * FROM public.agenda;";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Agenda> listadoAgendas = new ArrayList<>();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.setFecha(rs.getString("fecha"));
                agenda.setHora(rs.getString("hora"));
                agenda.setId(rs.getInt("id_agenda"));
                listadoAgendas.add(agenda);
            }
            return listadoAgendas;

        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }


    @Override
    public boolean crear(Agenda objeto) {
        String sql = "INSERT INTO public.agenda (fecha, hora) VALUES (?, ?)";
        String fecha = objeto.getFecha();
        String hora = objeto.getHora();
        
        try {
            Connection conn = ConexionDB.conectar();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, fecha);
            prepareStatement.setString(2, hora);
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }

        return true;
    }

    @Override
    public boolean modificar(Agenda objeto) {
        String sql = "UPDATE public.agenda SET fecha='"+objeto.getFecha()+"', hora='"+objeto.getHora()+"' WHERE id_agenda="+objeto.getId()+";";

        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            conn.close();
            return true;

        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean eliminar(Agenda objeto) {
        String sql = "DELETE FROM public.agenda WHERE id_agenda="+objeto.getId()+";";
        
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();            
            statement.executeQuery(sql);
            conn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return false;
    }

    @Override
    public Agenda extraer(Integer id) {
        String sql = "SELECT * FROM public.agenda WHERE id_agenda="+id+";";
        try{
            Connection conn = ConexionDB.conectar();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.setFecha(rs.getString("fecha"));
                agenda.setHora(rs.getString("hora"));
                agenda.setId(rs.getInt("id_agenda"));
                
                return agenda;
            }

        }catch(SQLException e){
            System.out.println(e);
         }
        return null;
    }
    
}
