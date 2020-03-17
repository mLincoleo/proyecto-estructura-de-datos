package backend.gestion_datos;

import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GestorPeliculas {

    private final ObjectMapper objectMapper;
    private List<Pelicula> peliculas;
    private final String rutaPeliculas = "cine\\peliculas\\peliculas.json";

    public GestorPeliculas() throws IOException {
        peliculas =  new ArrayList<>();
        objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(new File(rutaPeliculas), Pelicula[].class);
            System.out.println("PELICULAS ENCONTRADAS");
        } catch (FileNotFoundException ex) {
            System.out.println("CREANDO PELICULAS");
            initialSetup();
            guardarPeliculas();
        }

    }
    
    public void limpiar() throws IOException{
        initialSetup();
        guardarPeliculas();
    }

    private void initialSetup() {
        String p1,p2,p3,p4,p5;
        p1 = "/imagenes/harrypotter.png";
        p2 = "/imagenes/shrek.png";
        p3 = "/imagenes/vendetta.png";
        p4 = "/imagenes/starwars.png";
        p5 = "/imagenes/lotr.png";
        peliculas.add(new Pelicula("El Señor de los Anillos", "Peter Jackson", Categoria.ACCION, Pg.MAYORES_16, UUID.randomUUID(),p5));
        peliculas.add(new Pelicula("Shrek", "Andrew Adamson, Vicky Jenson", Categoria.COMEDIA, Pg.TODO_PUBLICO, UUID.randomUUID(), p2));
        peliculas.add(new Pelicula("V de Vendetta", "James McTeigue", Categoria.SUSPENSO, Pg.MAYORES_18, UUID.randomUUID(), p3));
        peliculas.add(new Pelicula("La Guerra de las Galaxias", "George Lucas", Categoria.ACCION, Pg.MAYORES_12, UUID.randomUUID(),p4));
        peliculas.add(new Pelicula("Harry Potter y la Piedra Filosofal", "Chris Columbus", Categoria.DRAMA, Pg.TODO_PUBLICO, UUID.randomUUID(),p1));
    }

    public boolean guardarPeliculas() throws IOException {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(rutaPeliculas), peliculas);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Pelicula> obtenerPeliculas(String ruta) throws IOException, FileNotFoundException {
        return Arrays.asList(objectMapper.readValue(new File(ruta), Pelicula[].class));
    }
    
    public List<Pelicula> obtenerPeliculas() throws IOException, FileNotFoundException {
        return Arrays.asList(objectMapper.readValue(new File(rutaPeliculas), Pelicula[].class));
    }

    public void setPeliculas(List<Pelicula> pelis) {
        this.peliculas=pelis;
    }
    
}
