/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.cine.salas;

import backend.arbol.Tree;
import backend.cine.peliculas.Pelicula;

/**
 *
 * @author usuario
 */
public class Sala {
    
    
    //cada asiento es un boolean: false = vacio; true = reservado
    private Tree asientos;
    private int butaca;
    //debe contener pelicula, pero dicha pelicula debe contener esta sala
    private Pelicula pelicula;
    
    public Sala(Pelicula pelicula){
        butaca = 1;
        asientos = new Tree();
        this.pelicula = pelicula;
        for(int i=1;i<=12;i++){
               asientos.insert(i, true);
           }
    }
    
    public Sala(){
        
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + asientos + ", butaca=" + butaca + ", pelicula=" + pelicula + '}';
    }
    
    
    public Pelicula getPelicula(){
        return pelicula;
    }
    
    
    
    public Tree getAsientos() {
        return asientos;
    }

    public void setAsientos(Tree asientos) {
        this.asientos = asientos;
    }

    public int getButaca() {
        return butaca;
    }

    
    

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
}
