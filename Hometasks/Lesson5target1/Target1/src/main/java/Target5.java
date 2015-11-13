/**
 * Created by Admin on 12.11.2015.
 */
public class Target5 {
    public static void main(String [] args) {
        int [] a = {7,5,2,9,6};




        for (int i = a.length - 1; i >= 2; i--) {

            boolean sorted = true;

            for (int j = 0; j < i; j++) {

                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }

            if(sorted) {
                break;
            }
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
        }



