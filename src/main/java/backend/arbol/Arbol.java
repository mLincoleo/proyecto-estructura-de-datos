/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.arbol;

import backend.cine.peliculas.Pelicula;
import java.util.UUID;

/**
 *
 * @author usuario
 */
public class Arbol {

    Node root;

    public void add(Pelicula pelicula) {
        root = addRecursive(root, pelicula);
    }

    //añadir. se añade un objeto pelicula y se compara por id
    private Node addRecursive(Node nodoActual, Pelicula pelicula) {
        if (nodoActual == null) {
            return new Node(pelicula);
        }

        switch (pelicula.getId().compareTo(nodoActual.peli.getId())) {

            case -1:
                nodoActual.left = addRecursive(nodoActual.left, pelicula);
                break;
            case 0:
                return nodoActual;
            case 1:
                nodoActual.right = addRecursive(nodoActual.right, pelicula);
                break;
            default:
                System.err.print("error switch, el resultado fue menor que -1 o mayor a 1");

        }
        /*if (pelicula < nodoActual.value) {
            nodoActual.left = addRecursive(nodoActual.left, value);
        } else if (value > nodoActual.value) {
            nodoActual.right = addRecursive(nodoActual.right, value);
        } else {
            // value already exists
            return nodoActual;
        }
         */
        return nodoActual;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.peli.toString());
            traverseInOrder(node.right);
        }

    }

    private Node deleteRecursive(Node current, String id) {
        if (current == null) {
            return null;
        }

        if (id == current.peli.getId()) {
            // Node to delete found
            // ... code to delete the node will go here
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
        }
        if (id.compareTo(current.peli.getId()) < 0) {
            current.left = deleteRecursive(current.left, id);
            return current;
        }
        current.right = deleteRecursive(current.right, id);
        return current;

    }

    //buscar parte 1 (este se usa)
    public Pelicula obtenerNode(String id) {
        return containsNodeRecursive(root, id);
    }
//buscar parte 2 

    private Pelicula containsNodeRecursive(Node nodoActual, String id) {
        if (nodoActual == null) {
            return null;
        }
        if (id.compareTo(nodoActual.peli.getId()) == 0) {
            return nodoActual.peli;
        }
        return id.compareTo(nodoActual.peli.getId()) < 0
                ? containsNodeRecursive(nodoActual.left, id)
                : containsNodeRecursive(nodoActual.right, id);
    }

}

class Node {

    Pelicula peli;
    Node left;
    Node right;

    Node(Pelicula pelicula) {
        this.peli = pelicula;
        right = null;
        left = null;
    }
}
