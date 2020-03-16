
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

public class GestorPeliculas implements GestorArchivos{
    
    private final ObjectMapper objectMapper;
    
    public GestorPeliculas(){
        objectMapper = new ObjectMapper();
    }
    
    
    

    @Override
    public boolean guardarDatos(Object objetoAGuardar, String ruta) throws IOException {
        Pelicula pelicula = (Pelicula) objetoAGuardar;
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pelicula);
        peliculas.add(new Pelicula("titulo2", "direcctor2", Categoria.DRAMA, Pg.MAYORES_12, UUID.randomUUID()));
        peliculas.add(pelicula);
        try{
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(ruta), peliculas);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    
    public List<Pelicula> obtenerDatos(String ruta) throws IOException, FileNotFoundException {
        return Arrays.asList(objectMapper.readValue(new File(ruta), Pelicula[].class));
    }
    
}
