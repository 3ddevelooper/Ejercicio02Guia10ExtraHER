/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public final class EdificioDeOficinas extends Edificio {
    private Integer numOficinas;
    private Integer cantPerOficinas;
    private Integer numPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, Integer numOficinas,Integer cantPerOficinas,Integer numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPerOficinas = cantPerOficinas;
        this.numPisos = numPisos;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPerOficinas() {
        return cantPerOficinas;
    }

    public void setCantPerOficinas(Integer cantPerOficinas) {
        this.cantPerOficinas = cantPerOficinas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
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
