import java.util.Scanner;
public class Fibonaicc_series {
      static int a=0,b=1,c;

    public static void main(String[] args) {
        System.out.print(a+" "+b);
         Interface ob1=new Interface();
         ob1.akash(10);

    }
    void akash(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            akash(i-1);
        }
    }
}

