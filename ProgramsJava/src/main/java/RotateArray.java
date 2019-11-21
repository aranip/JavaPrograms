import java.util.Arrays;

public class RotateArray {

    /*Function to left rotate arr[] of siz n by d*/

    public static int[] leftRotate(int arr[], int d) {

        int result[] = new int[arr.length];
        for(int i =0 ; i < arr.length-d ; i++){
            result[i] = arr[i + d];
        }
        for(int i =0; i< d; i++){
            result[i+arr.length-d] = arr[i];
        }

        return  result;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        leftRotate(a,2);
        System.out.println(Arrays.toString(leftRotate(a,2)));
    }
}