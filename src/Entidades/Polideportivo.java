/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import Enums.Tipos;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public final class Polideportivo extends Edificio{
    
    private  String nombre;
    private Tipos tipo;

    public Polideportivo(double ancho, double alto, double largo, String nombre, Tipos tipo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double calcularSuperficie() {
        return ancho*alto;
    }

    @Override
    public double calcularVolumen() {
        return ancho*alto*largo;
    }
    
    
    
}
