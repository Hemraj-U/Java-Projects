public class Else_if_clause {
    public static void main(String[] args) {
        int a = 50, b = 50, c = 50;

        if (a > b && a > c){
            System.out.println("The larger number is a " + a);
        } else if (b > c && b > a) {
            System.out.println("The larger number is b " + b);
        } else if (c > a && c > b) {
            System.out.println("The larger number is c " + c);
        }
        else {
            System.out.println("End");
        }
    }
}
