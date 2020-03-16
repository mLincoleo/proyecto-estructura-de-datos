/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDatos;

import backend.gestion_datos.GestorPeliculas;
import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggi
 */
public class GestorPeliculasTest {

    private GestorPeliculas gestorPeliculas;
    private String ruta = "cine\\peliculas\\";

    public GestorPeliculasTest() {
        try {
            gestorPeliculas = new GestorPeliculas();
        } catch (IOException e) {
            System.out.println("FALLO GESTOR PELICULAS");
            e.printStackTrace();
        }
    }

    @Test
    public void testObtenerPelicula() {
        try {

            List<Pelicula> peliculasObtenidas = gestorPeliculas.obtenerPeliculas(ruta + "peliculas.json");
            for (int i = 0; i < peliculasObtenidas.size(); i++) {
                System.out.println("----------------------------------------------------------");
                System.out.println("nombre: " + peliculasObtenidas.get(i).getTitulo());
                System.out.println("director: " + peliculasObtenidas.get(i).getDirector());
                System.out.println("categoria: " + peliculasObtenidas.get(i).getCategoria());
                System.out.println("pg: " + peliculasObtenidas.get(i).getPg());
                System.out.println("id: " + peliculasObtenidas.get(i).getId());
                System.out.println("----------------------------------------------------------");
            }
            assertEquals(peliculasObtenidas.size(), 5);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
