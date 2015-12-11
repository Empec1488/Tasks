package L4T4;

/**
 * Created by Admin on 06.12.2015.
 */
public class L4T4 {
    public static void main (String[] args) {


        short sh = 190;
        byte b;

        if (sh > -128 && sh < 127) {
            b = (byte) sh;
        } else {
            System.out.println("Impossible");
        }

        int in = 340343;
        short so;
        if (in > -32768 && in < 32767) {
            so = (short) in;
        } else {
            System.out.println("Impossible");
        }
        long lg = 76842;
        int tt;
        if (lg > -2147483648 && lg < 2147483647) {
            tt = (int) lg;
        } else {
            System.out.println("Impossible");
        }











    }
}
