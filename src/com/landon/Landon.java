package com.landon;

public class Landon {

    public static void main(String[] args) {
	    // write your code here
        Worker workerClass = new Worker();
        double rando = Math.random();
        boolean data = rando > 0.5;

        System.out.println("Hello world!");
        System.out.println("Bye world!");
        System.out.println(workerClass.yon());
        System.out.println(workerClass.conMethod(data));
        System.out.println(workerClass.loopMethod((int) (rando * 100)));
    }
}
