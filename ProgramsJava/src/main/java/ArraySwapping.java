import java.util.Arrays;

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Class Geeks with its member function interchange()
 * a[][] = matrix input
 * r : number of rows
 * c : number of columns
 */
public class ArraySwapping {

    public static void main(String[] args) {
        int a[][] = new int[][]{{1,2,3,4},{4,5,6,7},{9,8,7,6}};

            for (int i = 0; i < a.length; i++) {
                    int temp = a[i][0];
                    a[i][0] = a[i][a[i].length-1];
                    a[i][a[i].length-1] = temp;
            }
            for(int[] i: a){
                System.out.println(Arrays.toString(i));
            }
    }
}

