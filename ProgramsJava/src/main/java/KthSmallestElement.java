import java.util.Arrays;

public class KthSmallestElement {

    public static int KthSmallest(Integer arr[], int k){

        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{5,4,2,6,7,8};
        int k =1;
        System.out.println("The smallest value is: " + KthSmallest(arr,k));
    }
}
