package nodo;

import java.util.ArrayList;

public class Nodo {
    private int id;

    private ArrayList<Integer> caminos;
    private boolean visitado;

    public Nodo(int id) {
        this.visitado = false;
        this.caminos = new ArrayList<>();
    }

    public void agregarConexion(int id) {
        this.caminos.add(id);
    }

    // Ensapsulamiento
    public ArrayList<Integer> getCaminos() {
        return caminos;
    }

    public void setCaminos(ArrayList<Integer> caminos) {
        this.caminos = caminos;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Nodo aux = (Nodo)o;
        if(aux.getId()==this.id)return true;
        return false;//To change body of generated methods, choose Tools | Templates.
    }
}
