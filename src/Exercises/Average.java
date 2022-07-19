package Exercises;

import Utils.Display;
import Utils.Limit;

public class Average extends Display {
    private int input1, input2, input3;

    public Average(Display display) {
        setInput(display);
    }

    private void setInput(Display display) {
        input1 = display.getInt("Escriba el numero uno: ", new Limit(0, 100));
        input2 = display.getInt("Ingrese el numero dos: ", new Limit(0, 100));
        input3 = display.getInt("Ingrese el numero tres: ", new Limit(0, 100));
    }

    public String getAverage() {
        return "El promedio es: "+ (input1+input2+input3)/3;
    }




}
