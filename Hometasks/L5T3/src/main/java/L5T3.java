/**
     * Created by Admin on 10.12.2015.
     */
    public class L5T3 {
    public static void main(String[] args) {


        char[][] mas = new char[6][6];
        int size = 6;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i) {
                    mas[i][j] = '*';
                } else {
                    mas[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
