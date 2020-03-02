
package gestionDatos;

import cine.peliculas.Pelicula;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.text.DefaultEditorKit;

public class FileMaker {
    
    private final Gson jsonHandler;
    private final ObjectMapper objectMapper;
    
    public FileMaker(){
        jsonHandler = new Gson();
        objectMapper = new ObjectMapper();
    }
    
    public void guardarPelicula(Pelicula pelicula,String ruta) throws IOException{
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(ruta), pelicula);
        
    }
    
    public Pelicula obtenerPelicula(String ruta) throws IOException{
        return objectMapper.readValue(new File(ruta), Pelicula.class);
    }
    
}
