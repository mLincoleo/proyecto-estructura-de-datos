package app;



import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import backend.gestion_datos.GestorPeliculas;
import java.io.IOException;
import java.util.UUID;
import backend.arbol.Arbol;

public class App {

    public static void main(String[] args) {
        //no hay main jaja
        //ahora lo hay
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        
        System.out.println(id1.compareTo(id2));
        
    }

}
