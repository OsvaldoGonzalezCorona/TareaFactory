/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory.tarea;

/**
 *
 * @author WARRIOR
 */
public class Tablet implements Dispositivo{
    private String marca;
    private String tamanioPantalla;
    private String almacenamiento;

    public Tablet() {
    }

    public Tablet(String marca, String tamanioPantalla, String almacenamiento) {
        this.marca = marca;
        this.tamanioPantalla = tamanioPantalla;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", tamanioPantalla=" + tamanioPantalla + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
    
}
