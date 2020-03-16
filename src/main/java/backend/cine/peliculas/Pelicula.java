/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.cine.peliculas;

import backend.cine.salas.Sala;
import java.util.UUID;

/**
 *
 * @author maggi
 */
public class Pelicula {

    private String titulo;
    private String director;
    private String categoria;
    private String pg;
    private String id;
    private Sala sala; 
    
    public Pelicula(String titulo, String director, Categoria categoria, Pg pg, UUID id) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria.name();
        this.pg = pg.name();
        //UUID
        this.id = id.toString();
    }
    
    public Pelicula(){
        //para que funcione la lectura de archivos
    }


    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPg() {
        return pg;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", categoria=" + categoria + ", pg=" + pg + ", id=" + id.toString() + '}';
    }

}
