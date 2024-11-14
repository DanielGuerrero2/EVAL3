public class Main {
    public static void main(String[] args) {
        String [][]ciudades = {{"Aguascalientes", "Calvillo","jesus Maria"},{"Chihuahua","Juarez","Parral","Delicias"},{"Guadalajara","Zapopan","Tlaquepaque"}};
        for (String[] ciudad : ciudades) {
            for (String s : ciudad) {
                System.out.println(s);
            }
        }
    }
}