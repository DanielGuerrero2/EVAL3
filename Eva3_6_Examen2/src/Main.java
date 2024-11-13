import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean playing  = true;
        System.out.println("Bienvenido a piedra, papel o tijera");
        System.out.println("Elije una opcion:");
        System.out.println("1.- Piedra");
        System.out.println("2.- Papel");
        System.out.println("3.- Tijera");
        System.out.println("4.- Salir");
        Scanner scanner = new Scanner(System.in);

        while(playing){
            int userChoice = scanner.nextInt();
            String []plays = {"Piedra","Papel","Tijera"};

            int computerChoice = (int) (Math.random() * 3) + 1;
            System.out.println("Tu eleccion: " + plays[userChoice - 1]);
            System.out.println("La eleccion de la computadora: " + plays[computerChoice - 1]);
            System.out.println(EvalPlay(userChoice,computerChoice));
            System.out.println("Quieres jugar de nuevo?");
            System.out.println("1.- Si");
            System.out.println("2.- No");
            int playAgain = scanner.nextInt();
            if(playAgain == 2){
                playing = false;
                System.out.println("Gracias por jugar");
            }


        }
    }

    public static  String EvalPlay(int userChoice,int computerChoice) {
        String result = "";
        boolean win =(userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2);
        if (userChoice == computerChoice) {
            result = "Empate";
        }
        else if (win) {
            result = "Ganaste";
        }
        else {
            result = "Perdiste";
        }
        return result;
    }

}