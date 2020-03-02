/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.peliculas;

/**
 *
 * @author maggi
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Categoria categoria;
    private Pg pg;
    private int id;

    public Pelicula(String titulo, String director, Categoria categoria, Pg pg, int id) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria;
        this.pg = pg;
        this.id = id;
    }

    public Pelicula() {

    }

    public int getId() {
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
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", categoria=" + categoria + ", pg=" + pg + ", id=" + id + '}';
    }

}
