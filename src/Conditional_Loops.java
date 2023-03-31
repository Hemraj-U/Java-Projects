public class Conditional_Loops {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("While loop");
        while (i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("\n Do while loop");
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }
        while (a <= 5);

        System.out.println("\n For Loop");
        int n = 10;
        for (int j=0; j<n; j++){  //2n = Even Number = 0 2 4 6 8 10...
            System.out.println(j);   //2n+1 = Odd Number = 1 3 5 7 9 11...
        }
        System.out.println("\n Decrement For Loop");
        for (int k=20; k>=0; k--){
            System.out.println(k);
        }
    }
}
