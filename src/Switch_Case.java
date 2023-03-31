import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You going to become adult");
            case 23 -> System.out.println("You ready to do job");
            case 60 -> System.out.println("You can diy anytime ");
            default -> System.out.println("Enjoy your Life");
        }
    }
}
