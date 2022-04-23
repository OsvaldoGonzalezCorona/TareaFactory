/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory.tarea;

import java.util.Scanner;

/**
 *
 * @author WARRIOR
 */
public class TestVenta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Qué dispositivo desea adquirir?: ");
        System.out.println(Dispositivo.COMPUTADORA_BASICA + ") Computadora básica");
        System.out.println(Dispositivo.COMPUTADORA_GAMER + ") Computadora gamer");
        System.out.println(Dispositivo.SMARTPHONE_NUEVO + ") Smartphone nuevo");
        System.out.println(Dispositivo.SMARTPHONE_VIEJO + ") Smartphone viejo");
        System.out.println(Dispositivo.iPAD + ") iPad");
        System.out.println(Dispositivo.TABLET_SAMSUNG + ") Tablet samsung galaxy");
        
        try {
            System.out.println("Elige un número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturo un número o su entrada no es válida");
        }
        
        Dispositivo dis = DispositivoFactory.createDispositivo(eleccion);
        System.out.println(dis.toString());
    }
    
}
