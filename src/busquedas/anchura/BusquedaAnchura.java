/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas.anchura;

import java.util.ArrayList;

/**
 *
 * @author roban
 */
public class BusquedaAnchura {
    
    private ArrayList<Nodo>grafo;
    private Cola cola;
    private ArrayList<Integer> ruta;

    public BusquedaAnchura(ArrayList<Nodo>grafo) {
        this.grafo = grafo;
        this.cola = new Cola();
        this.ruta = new ArrayList<>();
    }
    
    public void generarRuta(int idi){
        this.cola.encolar(idi);
        // expandimos
        while(this.cola.getCola().size()>0){
            expandir(this.cola.getCola().get(0));       
        }
        System.out.println();
        
    }

    private void expandir(int idi) {
        // encolamos principal
        //this.cola.encolar(idi);
        // encolamos a los caminos
        int p = this.grafo.indexOf(new Nodo(idi));
        if(!this.grafo.get(p).isVisitado()){ //aqui
            for(int c=0; c<this.grafo.get(p).getCaminos().size();c++){
                this.cola.encolar(this.grafo.get(p).getCaminos().get(c));
            }
            this.ruta.add(this.cola.getCola().get(0));
        }
        
        int des = this.cola.desencolar();
        //int pos = this.grafo.indexOf(des);
        this.grafo.get(des).setVisitado(true);  //aqui
    }
    
    
    
}
