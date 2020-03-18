
package backend.cine;

import backend.cine.peliculas.Pelicula;
import backend.cine.salas.Sala;
import backend.gestion_datos.GestorSalas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cine {
    
    private List<Sala> salasCine;
    private final GestorSalas gestorSalas;
    
    public Cine() throws IOException{
        gestorSalas = new GestorSalas();
        this.salasCine = gestorSalas.obtenerSalas();
    }
    
    public List<Sala> getSalas(){
        return salasCine;
    }
    
    
}
