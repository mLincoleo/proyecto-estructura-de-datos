/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import backend.arbol.Arbol;
import static backend.cine.peliculas.Categoria.*;
import backend.cine.peliculas.Pelicula;
import static backend.cine.peliculas.Pg.MAYORES_18;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ArbolTest {
    
    Arbol arboltest;
    UUID id;
    public ArbolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        arboltest = new Arbol();
        //tring titulo, String director, Categoria categoria, Pg pg, UUID id
        id =UUID.randomUUID();
        arboltest.add(new Pelicula("ass","assman",TERROR,MAYORES_18,id,null));
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Arbol.
     */
    @Test
    public void testAdd() {
      
    }

    /**
     * Test of traverseInOrder method, of class Arbol.
     */
    @Test
    public void testTraverseInOrder() {
        
    }
    
    @Test
    public void testBuscar(){
        
        
        
        
        Assert.assertNotNull(arboltest.obtenerNode(id));
    }
    
}
