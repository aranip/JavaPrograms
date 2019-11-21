import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {

    public static void KthLargest(Integer arr[], int k){
      Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0; i<k ; i++)
            System.out.println(arr[i] + " ");

    }
    public static void main(String[] args) {
Integer arr[] = new Integer[]{ 2,5,3,6,8,9,11,23};
int k =3;
         KthLargest(arr,k);
    }
}
