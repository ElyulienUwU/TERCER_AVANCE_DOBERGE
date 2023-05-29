/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva4_final_proyect;

/**
 *
 * @author Alonso
 */
public class almacen extends zona {
    public String horario;
   public String descripcion;
    
    public almacen(){
        this.nombre = "Almacen";
        this.horario = "6:00/23:00";
        this.descripcion = "zona de guradado de materiales";
    }
    public String toSting(){
        String cade = "datos : \n" + 
                       "nombre:  " + nombre + "\n" + 
                       "horario de trabajo :  " + horario + "\n" +
                       "descripcion : " + descripcion;
        return cade;
    }
}
