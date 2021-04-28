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
public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    /*
        Crear un constructor que no tenga parámetros
        y que asigne valores ya establecidos a todos 
        los atributos.
    nombre: Isidro Ayora
    ciudad: Loja
    numeroDoctores: 100
    numeroEnfermeros: 200
    
     */
    public Hospital() {

        nombre = "hospital utpl";
        ciudad = "loja";
        numeroDoctores = 200;
        numeroEnfermeros = 250;

    }

    Hospital(String nombre, String ciudad, int numeroDoctores, int numeroEnfermeros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

}
