public class Break_and_Continue {
    public static void main(String[] args) {
        // break and continue
//        for (int i=0; i<=5; i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i==2){
//                System.out.println("End the Loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");

        for (int i=0; i<=5; i++){
            if (i==2){
                System.out.println("End the Loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        System.out.println("Loop ends here");
    }
}
