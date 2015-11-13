/**
 * Created by Admin on 13.11.2015.
 */
public class target2 {
    public static void main (String[] args) {
        int a[] = {1, 2, 3};
        int b[] = new int[6];

        for (int i = 0; i < b.length; i++) {
            if (i < a.length) b[i] = a[i];
            else {
                b[i] = -1;

            }
        }
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

    }
}
