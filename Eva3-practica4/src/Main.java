public class Main {
    public static void main(String[] args) {

        System.out.println("Numero mayor: " + maxNumber(10, 20));
        System.out.println("Dia de la semana: " + dayOfWeek(1));

    }

    public static int maxNumber(int a, int b) {
        return a > b ? a : b;
    }

    //Metodo que regrese el día de la semana en texto
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Dia no valido";
        }
    }


}