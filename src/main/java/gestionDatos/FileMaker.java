
package gestionDatos;

import cine.peliculas.Pelicula;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;

public class FileMaker {
    
    private final Gson jsonHandler;
    private final ObjectMapper objectMapper;
    
    public FileMaker(){
        jsonHandler = new Gson();
        objectMapper = new ObjectMapper();
    }
    
    public void guardarPelicula(Pelicula pelicula,String ruta) throws IOException{
        String fileName = pelicula.getTitulo() + pelicula.getId() + ".json";
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(ruta + fileName), pelicula);
        
    }
    
    public Pelicula obtenerPelicula(String ruta, String nombrePelicula,int idPelicula) throws IOException{
        
        return objectMapper.readValue(new File(ruta + nombrePelicula + idPelicula + ".json"), Pelicula.class);
    }
    
}
