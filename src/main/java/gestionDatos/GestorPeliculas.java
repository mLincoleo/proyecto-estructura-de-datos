
package gestionDatos;

import cine.peliculas.Pelicula;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GestorPeliculas implements GestorArchivos{
    
    private final ObjectMapper objectMapper;
    
    public GestorPeliculas(){
        objectMapper = new ObjectMapper();
    }
    
    
    

    @Override
    public void guardarDatos(Object objetoAGuardar, String ruta) throws IOException {
        Pelicula pelicula = (Pelicula) objetoAGuardar;
        String fileName = pelicula.getTitulo() + pelicula.getId() + ".json";
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(ruta + fileName), pelicula);
    }

    @Override
    public Object obtenerDatos(String ruta, String nombreArchivo) throws IOException, FileNotFoundException {
        return objectMapper.readValue(new File(ruta  + nombreArchivo +  ".json"), Pelicula.class);
    }
    
}
