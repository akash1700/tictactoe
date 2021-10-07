import java.util.Scanner;
public class Coin_distrebute {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner scan = new Scanner(System.in);
        int coine1,coine2,coine5;
        int dc,fd;
        int no= scan.nextInt();

        coine5=no/5;
        dc=no%5;
        coine2=dc/2;
        fd=dc%2;
        coine1=fd;

        System.out.println("the divide coine is :"+coine5+" "+coine2+" "+coine1);
    }
}
