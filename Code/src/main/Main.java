package main;

import classes.EncriptacionAES;

/**
 *
 * @author Josee
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoOriginal = "ID: 1, Fecha de Plantacion: 12, Temperatura: 12.0, Humedad: 12.0, Longitud: 12";
        
        // Encriptar
        String textoEncriptado = EncriptacionAES.encriptar(textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado);
        
        // Desencriptar
        String textoDesencriptado = EncriptacionAES.desencriptar(textoEncriptado);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }
}

