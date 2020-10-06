package main;

public class Main {

    public static void main (String[] args){

        for (int i=1; i<=10; i++){
            Thread thread = new Thread(new Potences(i));

            //We give priority to the pair numbers
            if((i%2)==0){
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }

            //Once we have given the priority, we start running
            thread.start();
        }
    }

    //DUDA PARA EL PROFESOR:
    /* Aun estableciendo las prioridades, a veces se cuela
    un numero impar, ¿es esto normal?*/

}
