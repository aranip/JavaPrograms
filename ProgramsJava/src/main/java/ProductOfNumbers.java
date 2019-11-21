import java.math.BigInteger;

public class ProductOfNumbers {

    public static void main(String[] args) {
        int[] a = {345, 567, -238, -235, 876, 399, 12, 23,
                345, 567, -238, -235, 876, 399, 12, 23,
                345, 567, -238, -235, 876, 399, 12, 23,
                345, 567, -238, -235, 876, 399, 12, 23,
                345, 567, -238, -235, 876, 399, 12, 23,
                345, 567, -238, -235, 876, 399, 12, 23, -234};
        //return 1 if the result is positive or -1 if its negative or 0 if its 0
        int result = 1;
        for (int i = 0; i < a.length ; i++) {
            System.out.println("Here is the :" + i);
            if (a[i] > 0) {
                result *= 1;
            } else if (a[i] < 0) {
                result *= -1;
            } else if (a[i] == 0) {
                result *= 0;
            }
        }

        System.out.println(result);
    }
}
