package app;



import cine.peliculas.Categoria;
import cine.peliculas.Pelicula;
import cine.peliculas.Pg;
import gestionDatos.GestorPeliculas;
import java.io.IOException;
import java.util.UUID;
import logica.Arbol;

public class App {

    public static void main(String[] args) {
        //no hay main jaja
        //ahora lo hay
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        
        System.out.println(id1.compareTo(id2));
        
    }

}
