import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        int java, mp, ca, se, dcn;
        float total;
        float per;
        String name;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the your Name: ");
        name = rd.readLine();

        System.out.print("Enter the marks in java: ");
        java = Integer.parseInt(rd.readLine());

        System.out.print("Enter the marks in MP: ");
        mp = Integer.parseInt(rd.readLine());

        System.out.print("Enter the marks in CA: ");
        ca = Integer.parseInt(rd.readLine());

        System.out.print("Enter the marks in SE: ");
        se = Integer.parseInt(rd.readLine());

        System.out.print("Enter the marks in DCN: ");
        dcn = Integer.parseInt(rd.readLine());
        System.out.println();

        total = java + mp + ca + se + dcn;
        System.out.println("Total marks of " + name + " is :" + total);
        System.out.println();

        per = total/500*100;
        System.out.println("The percentage of " + name + " is: " + per);
    }
}
