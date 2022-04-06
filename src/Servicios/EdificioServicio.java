/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Enums.Tipos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class EdificioServicio {

    private int cantPersonasPorPiso(int personas, int oficinas) {

        return personas * oficinas;
    }

    private int cantPersonaPorEdificio(int personas, int oficinas, int pisos) {

        return cantPersonasPorPiso(personas, oficinas) * pisos;
    }

    public void mostrarDatos() {
        List<Edificio> edificios = new ArrayList();
        int contTechado = 0, contAbierto = 0, cont = 0;
        edificios.add(new EdificioDeOficinas(100, 30, 80, 5, 10, 5));
        edificios.add(new EdificioDeOficinas(200, 40, 80, 4, 5, 10));
        edificios.add(new Polideportivo(200, 50, 100, "Polideportivo 1", Tipos.TECHADO));
        edificios.add(new Polideportivo(100, 20, 50, "Polideportivo 2", Tipos.ABIERTO));
        
        Collections.shuffle(edificios);

        for (Edificio edi : edificios) {

            if (edi instanceof EdificioDeOficinas) {
                cont++;
                System.out.println("Edificio De Oficinas " + (cont) + "\nSuperficie: " + edi.calcularSuperficie() + "m²" + "\nVolumen: " + edi.calcularVolumen() + "m³"
                        + "\nCantidad de personas que entran en un piso: " + cantPersonasPorPiso(((EdificioDeOficinas) edi).getCantPerOficinas(), ((EdificioDeOficinas) edi).getNumOficinas())
                        + "\nCantidad de personas que entran en el edificio es: " + cantPersonaPorEdificio(((EdificioDeOficinas) edi).getCantPerOficinas(), ((EdificioDeOficinas) edi).getNumOficinas(), ((EdificioDeOficinas) edi).getNumPisos())+"\n");

            }
            if (edi instanceof Polideportivo) {
                System.out.println("Nombre: " + ((Polideportivo) edi).getNombre() + "\nTipo: " + ((Polideportivo) edi).getTipo().getValue() + "\nSuperficie: " + edi.calcularSuperficie() + "m²" + "\nVolumen: " + edi.calcularVolumen() + "m³\n");
                if (((Polideportivo) edi).getTipo().getValue().equalsIgnoreCase("techado")) {
                    contTechado++;
                }

                if (((Polideportivo) edi).getTipo().getValue().equalsIgnoreCase("abierto")) {
                    contAbierto++;
                }

            }

        }
        System.out.println("La cantidad de polideportivos techados es: " + contTechado);
        System.out.println("La cantidad de polideportivos abiertos es: " + contAbierto + "\n");
    }
}
