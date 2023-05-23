package busquedaanchura;

import java.util.ArrayList;

public class Cola {
    private ArrayList<Integer> cola;

    public Cola(){
        this.cola = new ArrayList<>();
    }
    
    public void encolar(int aux){
        this.cola.add(aux);
    }

    public int desencolar(){
        int valor = this.cola.get(0);
        this.cola.remove(0);
        return valor;
    }


    public ArrayList<Integer> getCola() {
        return cola;
    }

    public void setCola(ArrayList<Integer> cola) {
        this.cola = cola;
    }
}
