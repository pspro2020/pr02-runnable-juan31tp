package main;

public class Potences implements Runnable{

    int n;

    Potences(int n){
        this.n=n;
    }

    @Override
    public void run(){
        //For each number, we show the potences from 0 to 10
        for(int i=0; i<=10; i++){
            double potences=Math.pow(n,i);
            System.out.printf("%s: %d ^%d = %f\n", Thread.currentThread().getName(), n, i, potences);
        }
    }

}
