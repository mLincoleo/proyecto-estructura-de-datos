/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionDatos;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author maggi
 */
public interface GestorArchivos {
    public abstract boolean guardarDatos(Object objetoAGuardar,String ruta) throws IOException;
    public abstract Object obtenerDatos(String ruta,String nombreArchivo) throws IOException,FileNotFoundException;
}
