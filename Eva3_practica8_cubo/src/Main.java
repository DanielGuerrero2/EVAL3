

public class Main {
    public static void main(String[] args) {
     int [][][] cubo = new int[2][5][3];
     System.out.println(cubo.length);
     System.out.println(cubo[0].length);
     System.out.println(cubo[0][0].length);
     for (int i = 0; i < cubo.length; i++) {
         for (int j = 0; j < cubo[i].length; j++) {
             for (int k = 0; k < cubo[i][j].length; k++) {
                 cubo[i][j][k] = (int )(Math.random() * 100);
                 System.out.println(cubo[i][j][k]);
             }
         }
     }
    }

}