public class Methods {
    int check(int x, int y){
        int z;
        if(x > y){
            z = x;
        }
        else {
            z = y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        Methods obj = new Methods();
        c = obj.check(a,b);
        System.out.println(c);

        int x1 = 20;
        int x2 = 10;
        int x3 = obj.check(x1, x2);
        System.out.println(x3);
    }
}
