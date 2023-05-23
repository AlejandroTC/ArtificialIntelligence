package inteligenciaartificial;

import java.util.ArrayList;

import busquedaanchura.BusquedaAnchura;
import busquedaprofundidad.BusquedaProfundidad;
import nodo.Nodo;

public class Inteligenciaartificial {
    public static void main(String[] args){
        ArrayList<Nodo> grafo = new ArrayList<>();
        
        Nodo n0 = new Nodo(0);  //D
        n0.agregarConexion(1);  //D -> B
        n0.agregarConexion(2);  //D -> C
        Nodo n1 = new Nodo(1);  //B
        n1.agregarConexion(3);  //B -> H
        Nodo n2 = new Nodo(2);  //C
        n2.agregarConexion(4);  //C -> R
        Nodo n3 = new Nodo(3);  //H
        n3.agregarConexion(6);  //H -> A
        Nodo n4 = new Nodo(4);  //R
        n4.agregarConexion(3);  //R -> H
        Nodo n5 = new Nodo(5);  //T
        Nodo n6 = new Nodo(6);  //A
        n3.agregarConexion(5);  //H -> T
        
        grafo.add(n0);
        grafo.add(n1);
        grafo.add(n2);
        grafo.add(n3);
        grafo.add(n4);
        grafo.add(n5);
        grafo.add(n6);

        
        BusquedaProfundidad bp = new BusquedaProfundidad(grafo);
        bp.generarRuta(0);
        
    }
}
