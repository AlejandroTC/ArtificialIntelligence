package busquedaanchura;

import java.util.ArrayList;

import nodo.Nodo;

public class BusquedaAnchura {
    private ArrayList<Nodo> grafo;
    private Cola cola;
    private ArrayList<Integer> ruta;

    public BusquedaAnchura(ArrayList<Nodo> grafo) {
        this.grafo = grafo;
        this.cola = new Cola();
        this.ruta = new ArrayList<>();
    }

    public void generarRuta(int idi) {
        this.cola.getCola().add(idi);
        while (this.cola.getCola().size() > 0) {
            expandir(this.cola.getCola().get(0));
        }
    }

    private void expandir(int idi) {
        // Encolar principal
        this.cola.encolar(idi);
        // Encolar caminos
        int p = this.grafo.indexOf(new Nodo(idi));
        for (int c = 0; c < this.grafo.get(p).getCaminos().size(); c++) {
            this.cola.encolar(this.grafo.get(p).getCaminos().get(c));
        }
        this.ruta.add(this.cola.getCola().get(0));
        int des = this.cola.desencolar();
        int pos = this.grafo.indexOf(new Nodo(des));
        this.grafo.get(pos).setVisitado(true);

    }

}
