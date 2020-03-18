package backend.gestion_datos;

import backend.cine.peliculas.Categoria;
import backend.cine.peliculas.Pelicula;
import backend.cine.peliculas.Pg;
import backend.cine.salas.Sala;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GestorSalas {

    private final ObjectMapper objectMapper;
    private List<Sala> salas;
    private final String rutaPeliculas = "cine\\peliculas\\salas.json";

    public GestorSalas() throws IOException {
        salas =  new ArrayList<>();
        objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(new File(rutaPeliculas), Sala[].class);
        } catch (FileNotFoundException ex) {
            System.out.println("CREANDO PELICULAS");
            initialSetup();
            guardarSalas();
        }

    }
    
    public void limpiar() throws IOException{
        initialSetup();
        guardarSalas();
    }

    private void initialSetup() {
        String p1,p2,p3,p4,p5;
        p1 = "/imagenes/harrypotter.png";
        p2 = "/imagenes/shrek.png";
        p3 = "/imagenes/vendetta.png";
        p4 = "/imagenes/starwars.png";
        p5 = "/imagenes/lotr.png";
        salas.add(new Sala(new Pelicula("El Señor de los Anillos", "Peter Jackson", Categoria.ACCION, Pg.MAYORES_16, UUID.randomUUID(),p5)));
        salas.add(new Sala(new Pelicula("Shrek", "Andrew Adamson, Vicky Jenson", Categoria.COMEDIA, Pg.TODO_PUBLICO, UUID.randomUUID(), p2)));
        salas.add(new Sala(new Pelicula("V de Vendetta", "James McTeigue", Categoria.SUSPENSO, Pg.MAYORES_18, UUID.randomUUID(), p3)));
        salas.add(new Sala(new Pelicula("La Guerra de las Galaxias", "George Lucas", Categoria.ACCION, Pg.MAYORES_12, UUID.randomUUID(),p4)));
        salas.add(new Sala(new Pelicula("Harry Potter y la Piedra Filosofal", "Chris Columbus", Categoria.DRAMA, Pg.TODO_PUBLICO, UUID.randomUUID(),p1)));
    }

    public boolean guardarSalas() throws IOException {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(rutaPeliculas), salas);
        } catch (Exception e) {
            System.out.println("FALLO GUARDAR SALAS");
            return false;
        }
        return true;
    }

    public List<Sala> obtenerSalas() throws IOException, FileNotFoundException {
        return Arrays.asList(objectMapper.readValue(new File(rutaPeliculas), Sala[].class));
    }
    

    public void setSalas(List<Sala> salas) {
        this.salas=salas;
    }
    
}
