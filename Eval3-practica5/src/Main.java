public class Main {
    public static void main(String[] args) {

        String [] data = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String  []  meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto" , "septiembre","Octubre", "Noviembre", "Diciembre"};
        int [] billetes ={20,50,100,200,500,1000};
        printData(data);
        printData(meses);
        printInt(billetes);

    }

    public static void printData(String [] data) {
        for (String s : data) {
            System.out.println(s);
        }
    }

    public static void printInt(int [] data) {
        for (int i : data) {
            System.out.println(i);
        }
    }

}