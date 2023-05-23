package busquedaprofundidad;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Integer> pila;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public void enPilar(int aux) {
        this.pila.add(aux);
    }

    public int desenPilar() {
        int valor = this.pila.get(this.pila.size() - 1);
        pila.remove(this.pila.size() - 1);
        return valor;
    }

    public ArrayList<Integer> getPila() {
        return pila;
    }

}