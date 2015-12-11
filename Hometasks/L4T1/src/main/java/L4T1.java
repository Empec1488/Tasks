/**
 * Created by Admin on 06.12.2015.
 */
public class L4T1 {
    public static void main(String[] args) {

        byte a = 120;

        short b = (short)a;

        System.out.println(b);

        int c = (int) b;

        System.out.println(c);


        char d = (char) c;

        System.out.println(d);


        long f = (long) d;

        System.out.println(f);


        float e = (float) d;

        System.out.println(e);


        double g = (double) d;

        System.out.println(g);


        float j = (float) f;

        System.out.println(j);


        double i = (double) f;

        System.out.println(i);

        double dou = 2.0034543543534534342535;
        float flo = (float) dou;
        int in = 2143242352;
        System.out.println("dou = " + dou + ", flo = " + flo + ", int = " + in);
        short sh = (short) in;
        System.out.println("short = " + sh);
    }
}
