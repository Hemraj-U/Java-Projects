public class Method_overloading {
    static int sum(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 5, 4, and 2 is: " + sum(5,4,2));
        System.out.println("The sum 0f 2, 4, 5, 6, and 7 is: " + sum(2,4,5,6,7 ));
    }
}
