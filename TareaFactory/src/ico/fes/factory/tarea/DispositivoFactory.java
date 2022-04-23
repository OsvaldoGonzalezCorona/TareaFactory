/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory.tarea;

/**
 *
 * @author WARRIOR
 */
public class DispositivoFactory {
    public static Dispositivo createDispositivo (int tipo) {
        switch (tipo) {
            case Dispositivo.COMPUTADORA_BASICA:
                return new Computadora("Intel CORE i3", "8 GB", "NVIDIA GeForce GT 730", false);
            
            case Dispositivo.COMPUTADORA_GAMER:
                return new Computadora("Intel CORE i7", "16-32 GB 3200Hz", "NVIDIA GeForce RTX 3070", true);
            
            case Dispositivo.SMARTPHONE_NUEVO:
                return new Smartphone("HUAWEI", "4400 mAh", true);
                
            case Dispositivo.SMARTPHONE_VIEJO:
                return new Smartphone("Bmobile", "800 mAh", false);
                
            case Dispositivo.iPAD:
                return new Tablet("Apple", "10.2 pulgadas", "64 GB");
                
            case Dispositivo.TABLET_SAMSUNG:
                return new Tablet("Samsung", "12.4 pulgadas", "64 GB");
                
            default:
                throw new AssertionError();
        }
    }
    
}
