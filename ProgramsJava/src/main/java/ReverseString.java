
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseString {
    public static void main (String[] args) {
        //code
      /*  Scanner s = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = s.nextLine();

        char[] c = input.toCharArray();

        for(int i=c.length-1;i>=0;i--){

            System.out.print(c[i]);

        } */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = sc.nextLine();
        String s[] = input.split("[.]");
        String reverse = "";
        for (int i = s.length-1; i >= 0; i--) {
            reverse += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(reverse.trim());
    }
    }









