import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        while(testcases > 0){
             String pattern =sc.nextLine();
             try{
                 Pattern.compile(pattern);
                 System.out.println("Valid");
             } catch (Exception e) {
                 System.out.println("Invalid");

             }
        }
    }
}
