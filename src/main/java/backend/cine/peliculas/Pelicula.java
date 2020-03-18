/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.cine.peliculas;

import backend.arbol.Tree;
import backend.cine.salas.Sala;
import java.io.File;
import java.util.Objects;
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
    private String foto;
    
    public Pelicula(String titulo, String director, Categoria categoria, Pg pg, UUID id, String img) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria.name();
        this.pg = pg.name();
        //UUID
        this.id = id.toString();
        this.foto=img;
    }
    
    
    public Pelicula(String titulo, String director, Categoria categoria, Pg pg, UUID id) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria.name();
        this.pg = pg.name();
        //UUID
        this.id = id.toString();
        this.foto=null;
    }

    
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
    public Pelicula(){
        //para que funcione la lectura de archivos
        //NO BORRAR
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.pg, other.pg)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        return true;
    }
    
    

    
    
}
