import Exercises.AreaAndPerimeter;
import Exercises.Average;
import Exercises.NewNumer;
import Exercises.RNumber;
import Utils.Display;
import Utils.Limit;

public class Menu {

    private Display display;

    private final int NUMBER_OPTION = 5;
    private final int FIRST_OPTION = 1;

    public static void main(String[] args) {
        new Menu().play();
    }

    public Menu() {
        display = new Display();
    }

    public void play() {
        int option = 0;

        String msg = "Ingrese la opcion: ";
        Limit limit = new Limit(FIRST_OPTION, NUMBER_OPTION);

        do {
            printMenu();

            option = display.getInt(msg, limit);

            getOption(option);

        }while (option != NUMBER_OPTION);
    }

    private void getOption(int option){
        switch (option) {
            case 1:
                NewNumer nn = new NewNumer(display);
                display.printTitleMessage("El numero siguiente es: " + nn.getNewNumber());
                break;
            case 2:
                Average a = new Average(display);
                display.printTitleMessage("El promedio es: " + a.getAverage());
                break;
            case 3:
                AreaAndPerimeter ap = new AreaAndPerimeter(display);
                display.printTitleMessage("Rectangulo: " + ap.getAreaAndPerimeter());
               // shape = new Exercises.AreaAndPerimeter(display);
                break;
            case 4:
               RNumber rn = new RNumber(display);
               display.printTitleMessage("Resultado: " + rn.getRandomNumber());
                break;
            default:
                display.printTitleMessage("Gracias! por participar");
                break;
        }
    }

    private void printMenu() {
        display.printText("1) El numero siguiente: ");
        display.printText("2) Calcula el promedio: ");
        display.printText("3) Calcula el area y perimetro: ");
        display.printText("4) Genera un numero aleatorio: ");
        display.printText("5) Salir");
    }
}
