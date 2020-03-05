/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.gestionSocios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggi
 */
public class GestorSociosTest {
    
    private GestorSocios gestorSocios;
    
    public GestorSociosTest() {
        this.gestorSocios = new GestorSocios();
    }

    @Test
    public void testValidarFechaNacimiento() {
        assertTrue(gestorSocios.validarFechaNacimiento("10/10/2010"));
    }
    
}
