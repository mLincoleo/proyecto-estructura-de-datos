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
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggi
 */
public class GestorPeliculasTest {

    private GestorPeliculas gestorPeliculas = new GestorPeliculas();
    private String ruta = "cine\\peliculas";

    public GestorPeliculasTest() {
        gestorPeliculas = new GestorPeliculas();
    }

    @Test
    public void testGuardarPelicula() {
        try {
            Pelicula p = new Pelicula("titulo", "director", Categoria.ROMANCE, Pg.TODO_PUBLICO, UUID.randomUUID());
            assertTrue(gestorPeliculas.guardarDatos(p, ruta + "peliculas.json"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testObtenerPelicula(){
        try{
            Pelicula p = (Pelicula)gestorPeliculas.obtenerDatos(ruta + "peliculas.json");
            assertNotNull(p);
            p.toString();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
