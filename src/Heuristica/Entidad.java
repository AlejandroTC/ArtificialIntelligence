package Heuristica;

import java.util.Random;

/*
 *El objetivo de la entidad e que represente la posicion de en la que tienen que estar
 colocadas las damas (propuesta), ademas me dira cuantos atques conlleva
 */

public class Entidad{
    private int [] estado;
    private int atques;
    //2 formas de construir
        //Aleatorio 
        public Entidad(int n){
            this.estado = new int[n];
            iniciarAleatoriamente();
            calcularNumeroAtaques();
        }
        
        //argumento pero dirigido a la parte de los estados
            //Debe tener la capacidad de calcular el numero de ataques que tiene el estado
        public Entidad(int [] estado){
            this.estado = estado.clone();
            calcularNumeroAtaques();
        }

        private void calcularNumeroAtaques() {
        
        }
        
        private void iniciarAleatoriamente() {
            Random ran = new Random();
            for(int x=0; x < this.estado.length;x++){
                this.estado[x] = ran.nextInt(this.estado.length);
            }
        }
}