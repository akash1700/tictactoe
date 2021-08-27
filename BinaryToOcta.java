import java.util.LinkedList;
import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        int binary, temp;
        Scanner scan= new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        binary = scan.nextInt();

        while(binary != 0){
            temp = binary%1000;
            binary = binary/1000;

            switch (temp){
                case 0 :{
                    ll.add(0);
                    break;
                }
                case 1 :{
                    ll.add(1);
                    break;
                }
                case 10 :{
                    ll.add(2);
                    break;
                }
                case 11 :{
                    ll.add(3);
                    break;
                }
                case 100 :{
                    ll.add(4);
                    break;
                }
                case 101 :{
                    ll.add(5);
                    break;
                }
                case 110 :{
                    ll.add(6);
                    break;
                }
                case 111 :{
                    ll.add(7);
                }
            }

        }
        System.out.println(ll);
        int octal = 0, multiply = 1;
        for(int i= 0;i<ll.size();i++) {
            octal = octal + multiply * ll.get(i);

          multiply=multiply*10;
        }
        System.out.println(octal);
    }
}
