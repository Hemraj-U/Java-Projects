import java.util.Scanner;

public class Largest_of_three_no {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find The largest of 3 numbers \n");
        System.out.print("Enter the 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        b = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("Larger number is a " + a);
        }
        if (b > c && b > a){
            System.out.println("Larger number is b " + b);
        }
        if (c > a && c > b){
            System.out.println("Larger number is c " + c);
        }
    }
}

