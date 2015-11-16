/**
 * Created by Admin on 15.11.2015.
 */
public class Target1 {
    public static void main(String[] args) {

        int[][] matr = new int[3][];
        int[][] tMatr = new int[3][];

        System.out.println("Matrix: ");

        for (int i = 0; i < matr.length; i++) {
            matr[i] = new int[3];
            tMatr[i] = new int[3];
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(matr[i][j] + " ");


            }
            System.out.println();
        }

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                tMatr[i][j] = matr[j][i];


            }
            }
        System.out.println("Result: ");


        for (int i = 0; i < tMatr.length; i++) {
            for (int j = 0; j < tMatr[i].length; j++) {
                System.out.print(tMatr[i][j] + " ");

            }
            System.out.println();
        }


    }
}