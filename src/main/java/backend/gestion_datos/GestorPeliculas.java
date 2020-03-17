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
        peliculas.add(new Pelicula("titulo1", "direcctor1", Categoria.ACCION, Pg.MAYORES_12, UUID.randomUUID()));
        peliculas.add(new Pelicula("titulo2", "direcctor2", Categoria.COMEDIA, Pg.MAYORES_16, UUID.randomUUID()));
        peliculas.add(new Pelicula("titulo3", "direcctor3", Categoria.DRAMA, Pg.MAYORES_18, UUID.randomUUID()));
        peliculas.add(new Pelicula("titulo4", "direcctor4", Categoria.ROMANCE, Pg.TODO_PUBLICO, UUID.randomUUID()));
        peliculas.add(new Pelicula("titulo5", "direcctor5", Categoria.SUSPENSO, Pg.MAYORES_12, UUID.randomUUID()));
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
