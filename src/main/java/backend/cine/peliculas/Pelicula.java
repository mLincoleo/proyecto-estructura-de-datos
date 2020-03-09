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
    private Categoria categoria;
    private Pg pg;
    //vamos a trabajar con UUID
    private UUID id;
    private Sala sala; 
    
    public Pelicula(String titulo, String director, Categoria categoria, Pg pg, UUID id, Sala sala) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria;
        this.pg = pg;
        //UUID
        this.id = id;
        //la pelicula debe contener una sala, y dicha sala debe contener esta pelicula
        this.sala = sala;
    }

    public Pelicula() {

    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Pg getPg() {
        return pg;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", categoria=" + categoria + ", pg=" + pg + ", id=" + id.toString() + '}';
    }

}
