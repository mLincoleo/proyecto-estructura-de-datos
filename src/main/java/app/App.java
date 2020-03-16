package app;



import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import backend.gestion_datos.GestorPeliculas;
import java.io.IOException;
import java.util.UUID;
import backend.arbol.Arbol;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException{
        //no hay main jaja
        //ahora lo hay
        GestorPeliculas g = new GestorPeliculas();
        g.guardarDatos(new Pelicula("titulo", "director", Categoria.COMEDIA, Pg.MAYORES_12, UUID.randomUUID()), "cine\\peliculas\\peliculas.json");
        List<Pelicula> peliculasObtenidas = g.obtenerDatos("cine\\peliculas\\peliculas.json");
        for (int i = 0; i < peliculasObtenidas.size(); i++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("nombre: " + peliculasObtenidas.get(i).getTitulo());
            System.out.println("director: " + peliculasObtenidas.get(i).getDirector());
            System.out.println("categoria: " + peliculasObtenidas.get(i).getCategoria());
            System.out.println("pg: " + peliculasObtenidas.get(i).getPg());
            System.out.println("id: " + peliculasObtenidas.get(i).getId());
            System.out.println("----------------------------------------------------------");
        }
    }

}
