package inteligenciaartificial;

import busquedas.anchura.BusquedaAnchura;
import busquedas.anchura.Nodo;
import java.util.ArrayList;

public class InteligenciaArtificial{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Nodo> grafo = new ArrayList<>();
        Nodo n0 = new Nodo(0);
        n0.agregarConexion(1);
        Nodo n1 = new Nodo(1);
        n1.agregarConexion(4);
        Nodo n2= new Nodo(2);
        n2.agregarConexion(0);
        Nodo n3= new Nodo(3);
        n3.agregarConexion(1);
        Nodo n4 = new Nodo(4);
        n4.agregarConexion(2);
        Nodo n5 = new Nodo(5);
        n0.agregarConexion(5);

        Nodo n6 = new Nodo(6);
        n0.agregarConexion(6);
        Nodo n7 = new Nodo(7);
        n2.agregarConexion(7);
        
        grafo.add(n0);
        grafo.add(n1);
        grafo.add(n2);
        grafo.add(n3);
        grafo.add(n4);
        grafo.add(n5);
        grafo.add(n6);
        grafo.add(n7);
        
        BusquedaAnchura ba = new BusquedaAnchura(grafo);
        ba.generarRuta(0);
    }
    
}
