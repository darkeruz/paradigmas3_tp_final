/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.darke.tpfinalagenda.logicaNegocio.controladores;

import java.util.ArrayList;

/**
 *
 * @author darke
 */
public interface IBaseControlador<T, ID> {
    public static final int ACCION_NUEVO=1;
    public static final int ACCION_MODIFICAR=2;
    public static final int ACCION_ELIMINAR=3;
    public static final int ACCION_VER=4;
    public ArrayList<T> extraerTodos();
    
    public abstract boolean crear(T objeto);
    public abstract boolean modificar(T objeto);
    public abstract boolean eliminar(T objeto);
    public abstract T extraer(ID id);
    
}
