/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory.tarea;

/**
 *
 * @author WARRIOR
 */
public class Smartphone implements Dispositivo{
    private String fabricante;
    private String bateria;
    private boolean huellaDactilar;

    public Smartphone() {
    }

    public Smartphone(String fabricante, String bateria, boolean huellaDactilar) {
        this.fabricante = fabricante;
        this.bateria = bateria;
        this.huellaDactilar = huellaDactilar;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public boolean isHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(boolean huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "fabricante=" + fabricante + ", bateria=" + bateria + ", huellaDactilar=" + huellaDactilar + '}';
    }
    
    
    
}
