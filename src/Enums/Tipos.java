/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Enums;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public enum Tipos {
    TECHADO("Techado"),ABIERTO("Abierto");
    
    private final String value;

    private Tipos(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
