import java.util.*;

public class pascal_trangal {

    public static void main(String[] args) {
        System.out.println("Enter the integer");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++) {
            for (int j =num; j>i; j--) {
                System.out.print("-");
            }
            int val=1;
                for (int j = 0; j <= i; j++) {
                    System.out.print( val+" ");
                    val=val*(i-j)/(j+1);

                }

                System.out.println(" ");

            }



    }
}