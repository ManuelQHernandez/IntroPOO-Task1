package Exercises;

import Utils.Display;

import java.util.Random;

public class RNumber extends Display {

    public RNumber(Display display) {
        generateRandomIntRange();
    }

    public double generateRandomResult(){

        Random r = new Random();
        int result = 0+r.nextInt(200);
        double average = (30*100)/result;
        return average;
    }

    public int generateRandomIntRange() {
        Random r = new Random();
        int result = 0+r.nextInt(200);
        return result;
    }

    public String getRandomNumber() {
        return "El numero aleatorio es: "+generateRandomIntRange() + " Con el 30% :" + generateRandomResult();
    }


}
