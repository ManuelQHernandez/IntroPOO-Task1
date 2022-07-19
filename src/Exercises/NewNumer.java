package Exercises;

import Utils.Display;
import Utils.Limit;

public class NewNumer extends Display {

    private int input;

    public NewNumer(Display display) {
        setInput(display);
    }

    private void setInput(Display display) {
        input = display.getInt("Escriba el numero: ", new Limit(0, 100));
    }

    public String getNewNumber() {

        return "Numero siguiente: " + (input+1);
    }



}
