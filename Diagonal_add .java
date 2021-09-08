import java.util.Scanner;

public class Diagonal_add {
    public static void main(String[]args){
        System.out.println("Enter the integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]aa=new int[n][n];
        System.out.println("Enter the matrix");
        Scanner sc1=new Scanner(System.in);
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                aa[i][j] = sc1.nextInt();
               
            }
        }
        System.out.println("The matrix are");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    System.out.print(aa[i][j]+" ");
                }
                System.out.println(" ");
            }

            int add = 0,add1 = 0;;
            for (int i = 0; i < aa.length; i++) {
//                System.out.println("The length size :"+aa.length);
                add = add + aa[i][i];
                add1 = add1 + aa[i][n - i - 1];

            }

        System.out.println( Math.abs(add-add1));


    }
}
