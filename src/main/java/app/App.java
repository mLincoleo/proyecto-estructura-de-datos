package app;

import cine.peliculas.Categoria;
import cine.peliculas.Pelicula;
import cine.peliculas.Pg;
import gestionDatos.FileMaker;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        FileMaker f = new FileMaker();
        try {
            String ruta = "C:\\Users\\maggi\\Documents\\NetBeansProjects\\Proyecto_Estructura_Datos\\src\\data\\pelicula\\";
            Pelicula p = new Pelicula("titulo", "director", Categoria.ROMANCE, Pg.TODO_PUBLICO, 0);
            f.guardarPelicula(p, ruta + "titulo0");
            Pelicula peliculaObtenida = f.obtenerPelicula(ruta,"titulo",0);
            System.out.println(peliculaObtenida.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
