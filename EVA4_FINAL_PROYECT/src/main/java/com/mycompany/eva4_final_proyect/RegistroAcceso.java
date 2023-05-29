/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva4_final_proyect;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alonso
 */
public class RegistroAcceso {
    public static void registrarAcceso() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatoFechaHora);

        System.out.println("Acceso registrado: " + fechaHoraFormateada );
    }
}

