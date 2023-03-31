import java.util.Scanner;

public class PractiseSet {
    public static void main(String[] args) {
        float [] arr = {10.5f, 20.10f, 10.12f, 25.46f, 15.12f};
        float sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is: " + sum);

        //2nd questions
        int [] array  = {12, 15, 16, 17, 18};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int present = sc.nextInt();
        boolean inArray = false;
        for (int i=0; i<array.length; i++) {
            if (present == array[i]) {
                inArray = true;
                break;
            }
        }
        if (inArray){
            System.out.println("Array is present");
        }
        else {
            System.out.println("Array is not present");
        }

        // 3rd problem
        int [] marks  = {12, 15, 16, 17, 18};
        int total=0;
        for(int element: marks){
            total = total+element;
        }
        System.out.println("Average is: " + total/marks.length);
        System.out.println("\n new ");

        //4th problem
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};

        int [][] mat2 = {{7, 8, 9},
                         {10, 11, 12}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}

