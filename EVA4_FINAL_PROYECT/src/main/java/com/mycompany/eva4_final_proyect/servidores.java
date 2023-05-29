/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva4_final_proyect;

/**
 *
 * @author Alonso
 */
public class servidores extends zona{
     public String horario;
   public String descripcion;
    
    public servidores(){
        this.nombre = "Almacen";
        this.horario = "00:00/24:00";
        this.descripcion = "zona donde se guarda todos los datos/informacion de la empresa";
    }
    public String toSting(){
        String cade = "datos : \n" + 
                       "nombre:  " + nombre + "\n" + 
                       "horario de trabajo :  " + horario + "\n" +
                       "descripcion : " + descripcion;
        return cade;
    }
}
