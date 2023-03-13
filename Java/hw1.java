package Java;
import java.util.Arrays;
import java.util.Random;

public class hw1 {
    public static void main(String[]args){

        Random random = new Random();

        int i = new Random().nextInt(101);

            System.out.println(i);
        
        int n = Integer.toBinaryString(i).length();

            System.out.println(Integer.toBinaryString(i));
            System.out.println(n);

        int count = 0;

            for ( int j = i; j <= Short.MAX_VALUE; j++) {
                if(j % n == 0) {
                    count++;
                }

            }

        int[] m1 = new int[count];


        for ( int j = i; j <= Short.MAX_VALUE; j++) {
            if(j % n == 0) {
                m1[--count]=j;
                
            }
                
        }

        System.out.println(Arrays.toString(m1));

        for (int k = Short.MIN_VALUE; k <= i; k++) {
            if(k % n !=0) {
                count++;
            }
        }
            
        int[] m2 = new int[count];

        for (int k = Short.MIN_VALUE; k <=i; k++) {
            if(k % n !=0) {
                m2[--count] = k;
            }


        }
        System.out.println(Arrays.toString(m2));
    }

}
