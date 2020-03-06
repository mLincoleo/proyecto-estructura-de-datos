/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.salas;

import cine.peliculas.Pelicula;

/**
 *
 * @author usuario
 */
public class Sala {
    
    
    //cada asiento es un boolean: false = vacio; true = reservado
    private boolean[][] asientos=new boolean[5][20];
    private int numeroSala;
    //debe contener pelicula, pero dicha pelicula debe contener esta sala
    private Pelicula pelicula;
    
    
   

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

    public int getNumeSala() {
        return numeroSala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    

    public void setNumeSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Sala( int numeroSala) {
        SetAsientosVacios();
        this.numeroSala = numeroSala;
    }
    
    private void SetAsientosVacios(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                this.asientos[i][j]=false;
            }
        }
        
    }
    
    
}
