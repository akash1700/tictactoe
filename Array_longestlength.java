import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
public class Array_longestlength {
    public static void main(String []args) {
        int temp, octial;
        System.out.println("Enter the size");
        HashSet<Integer> ll2 = new HashSet<Integer>();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the value");



        for (int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
            ll2.add(array[i]);
        }


        System.out.println(ll2);
        int length=0;
        for (int j=0;j<array.length;j++) {

            if (!ll2.contains(array[j] - 1)) {
                int no = array[j];


                while (ll2.contains(no)) {
                        no++;
                }
                if (length<no-array[j]){
                    length=no-array[j];
                }

            }

        }
        System.out.println("Long length is :"+length);
    }
}
