/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDatos;

import cine.peliculas.Categoria;
import cine.peliculas.Pelicula;
import cine.peliculas.Pg;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggi
 */
public class GestorPeliculasTest {

    private GestorPeliculas gestorPeliculas = new GestorPeliculas();
    private String ruta = "C:\\Users\\maggi\\Documents\\NetBeansProjects\\Proyecto_Estructura_Datos\\src\\data\\pelicula\\";

    public GestorPeliculasTest() {
        gestorPeliculas = new GestorPeliculas();
    }

    @Test
    public void testGuardarPelicula() {
        try {
            Pelicula p = new Pelicula("titulo", "director", Categoria.ROMANCE, Pg.TODO_PUBLICO, 0);
            assertTrue(gestorPeliculas.guardarDatos(p, ruta));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testObtenerPelicula(){
        try{
            Pelicula p = (Pelicula)gestorPeliculas.obtenerDatos(ruta, "titulo0");
            assertNotNull(p);
            p.toString();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
