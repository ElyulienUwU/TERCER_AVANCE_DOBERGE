package com.mycompany.eva4_final_proyect;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class EVA4_FINAL_PROYECT {

    public static void main(String[] args) {
        Planta pla = new Planta();
        almacen al = new almacen();
        oficinas of = new oficinas();
        servidores sv = new servidores();
        Scanner scanner = new Scanner(System.in);
        //NIP's de seguridad para entrar a diferentes zonas de la empresa
        int nipEmpleado = 1234;
        int nipLider = 5678;
        int nipGerente = 9012;
        int nipSupervisor = 3456;
    try{//esta seccion del codigo sirve para simular el lugar en el que se ingresa el codigo
        //se deve colocar un 1,2,3 o 4 dependiendo de a donde quieres ir  
        System.out.println("Zonas disponibles: ");
        System.out.println("1. Planta");
        System.out.println("2. Almacén");
        System.out.println("3. Oficinas");
        System.out.println("4. Servidores");
        System.out.print("Ingrese el número de la zona a la que desea entrar: ");
        int zonaSeleccionada = scanner.nextInt();

        int nipIngresado;
        switch (zonaSeleccionada) { 
            
                case 1:
                    System.out.print("Ingrese el NIP para acceder a la planta: ");
                    nipIngresado = scanner.nextInt();
                    if (nipIngresado==(nipEmpleado)||nipIngresado==(nipLider)||nipIngresado==(nipGerente)||nipIngresado==(nipSupervisor)) {//en este if muestra todos los codigos que haceptan la entrada a este lugar
                        System.out.println("Acceso concedido a la planta.");
                        System.out.println(pla.toSting());
                        RegistroAcceso.registrarAcceso();                   
                        // Acciones específicas de la planta
                    } else {
                        System.out.println("NIP incorrecto. Acceso denegado.");
                    }
                    break;

            case 2:
                System.out.print("Ingrese el NIP para acceder al almacén: ");
                nipIngresado = scanner.nextInt();
                if (nipIngresado==(nipLider)||nipIngresado==(nipGerente)||nipIngresado==(nipSupervisor)) {
                    System.out.println("Acceso concedido al almacén.");
                    System.out.println(al.toSting());
                    RegistroAcceso.registrarAcceso();
                    // Acciones específicas del almacén
                } else {
                    System.out.println("NIP incorrecto. Acceso denegado.");
                }
                break;
            case 3:
                System.out.print("Ingrese el NIP para acceder a las oficinas: ");
                nipIngresado = scanner.nextInt();
                if (nipIngresado==(nipGerente)||nipIngresado==(nipSupervisor)) {
                    System.out.println("Acceso concedido a las oficinas.");
                    System.out.println(of.toSting());
                    RegistroAcceso.registrarAcceso();
                    // Acciones específicas de las oficinas
                } else {
                    System.out.println("NIP incorrecto. Acceso denegado.");
                }
                break;
            case 4:
                System.out.print("Ingrese el NIP para acceder a los servidores: ");
                nipIngresado = scanner.nextInt();
                if (nipIngresado==nipSupervisor) {
                    System.out.println("Acceso concedido a los servidores.");
                    System.out.println(sv.toSting());
                    RegistroAcceso.registrarAcceso();
                    // Acciones específicas de los servidores
                } else {
                    System.out.println("NIP incorrecto. Acceso denegado.");
                }
                break;
            default:
                System.out.println("Zona no reconocida.");
        }
        
        scanner.close();
        }catch(InputMismatchException e){//estos catch sirven para que mostrar un error en caso de colocar letras en vez de numeros
                System.out.println("captura de formato incorrecta,  nose puede convertir a formato numerico");
        }catch(IllegalStateException e){
            System.out.println("captura de formato incorrecta,  nose puede convertir a formato numerico");
        }
    }
}

