/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory.tarea;

/**
 *
 * @author WARRIOR
 */
public class Computadora implements Dispositivo{
    private String procesador;
    private String memoriaRam;
    private String tarjetaVideo;
    private boolean SSD;

    public Computadora() {
    }

    public Computadora(String procesador, String memoriaRam, String tarjetaVideo, boolean SSD) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.tarjetaVideo = tarjetaVideo;
        this.SSD = SSD;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public boolean isSSD() {
        return SSD;
    }

    public void setSSD(boolean SSD) {
        this.SSD = SSD;
    }

    @Override
    public String toString() {
        return "Computadora{" + "procesador=" + procesador + ", memoriaRam=" + memoriaRam + ", tarjetaVideo=" + tarjetaVideo + ", SSD=" + SSD + '}';
    }
       
}
