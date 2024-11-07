import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        String name = captureText();
        System.out.println("Hola" + name);
        System.out.println("Ingresa tu edad: ");
        System.out.println("Tu edad es: " + captureAge());
        System.out.println("Ingresa tu salario: ");
        System.out.println("Tu salario es: " + captureNumber());

    }
    public static  String  captureText() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    public static double captureNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public  static  int captureAge() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}