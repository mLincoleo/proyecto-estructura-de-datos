/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.cine.peliculas;

import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import java.util.UUID;
import backend.arbol.Arbol;

/**
 *
 * @author usuario
 */
public class ManejoDePeliculas {

    Arbol arbol;

    public ManejoDePeliculas(Arbol arbol) {
        this.arbol = arbol;

    }

    public Pelicula obtenerPeliculaPorId(UUID id) {
        return arbol.obtenerNode(id);
    }
    
    public void  añadirPelicula (String titulo, String director, Categoria categoria, Pg pg){
        
        Pelicula pelicula = new Pelicula( titulo,  director,  categoria,  pg, UUID.randomUUID(),null);
        
        arbol.add(pelicula);
        
    }


}
