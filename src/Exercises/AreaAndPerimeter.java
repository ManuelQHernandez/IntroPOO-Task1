package Exercises;

import Utils.Display;
import Utils.Limit;

public class AreaAndPerimeter extends Display {

    private int base, altura;
    public AreaAndPerimeter(Display display) {
        setInput(display);
    }

    private void setInput(Display display) {
        base = display.getInt("Escriba la Base: ", new Limit(0, 100));
        altura = display.getInt("Escriba la Altura: ", new Limit(0, 100));
    }


    public String getAreaAndPerimeter() {
        double area = base * altura;
        double perimetro = 2*(base) + 2*(altura);
        return "El area es: " + area + " El perimetro es: " + perimetro;
    }

}
