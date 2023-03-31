import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        int n = 5;
        int fact=1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of given Number " + n + " is: " + fact);
    }
}

