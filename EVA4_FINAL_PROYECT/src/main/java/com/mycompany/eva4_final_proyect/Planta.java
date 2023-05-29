/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva4_final_proyect;

/**
 *
 * @author Alonso
 */
public class Planta extends zona {
   public String horario;
   public String descripcion;

    public Planta() {
        this.nombre = "Planta";
        this.horario = "7:00/23:00";
        this.descripcion = "zona de maquinaria donde trabajan los operadores de produccion";
    }
    public String toSting(){
        String cade = "datos : \n" + 
                       "nombre:  " + nombre + "\n" + 
                       "horario de trabajo :  " + horario + "\n" +
                       "descripcion : " + descripcion;
        return cade;
    }
}
