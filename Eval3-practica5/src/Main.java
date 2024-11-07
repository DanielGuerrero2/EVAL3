public class Main {
    public static void main(String[] args) {

        String [] data = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        printData(data);
    }
    public static void printData(String [] data) {
        for (String s : data) {
            System.out.println(s);
        }
    }
}