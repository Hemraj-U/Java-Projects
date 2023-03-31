import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args) {
        System.out.println("Taking Input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a = sc.nextInt();
        System.out.println("Enter the num 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}

