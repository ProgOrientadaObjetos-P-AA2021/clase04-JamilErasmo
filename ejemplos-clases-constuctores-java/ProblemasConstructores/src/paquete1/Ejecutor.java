/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombre = "hospital utpl";
        String ciudad = "loja";
        int numeroDoctores = 200;
        int numeroEnfermeros = 250;
        Hospital h1 = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        System.out.printf("Nombre: %s\nCiudad: %s\nNumero de Doctores: "
                + "%d\ndNumero de enfermeros: %d", h1.obtenerNombre(), h1.obtenerCiudad(),
                 h1.obtenerNumeroDoctores(), h1.obtenerNumeroEnfermeros());
    }
}
