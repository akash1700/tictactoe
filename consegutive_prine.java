import java.util.*;
public class consegutive_prine {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the value");
         int dc=sc.nextInt();

           LinkedList<Integer>ll1=new LinkedList<Integer>();


             for(int no=2;no<=dc;no++) {
                 int count=0;
                 for (int i = 2; i <= no/2; i++) {
                     if (no % i == 0) {
                         count = count + 1;
                            break;

                     }
                 }
                 if (count == 0) {
                     ll1.add(no);


                 }


             }
        System.out.println(ll1);

           int l=ll1.size();
        System.out.println(l);
        int d=0;
        int sum=0;
        int count=0;
        for(int k=0;k<ll1.size();k++) {
            sum = sum + ll1.get(k);
//            System.out.print(sum + " ");
            for (int m = 0; m <= ll1.size() - 1; m++) {
                if (sum == ll1.get(m)) {
                    if(sum<dc)
                        count++;
                    break;
                }

            }

        }
        System.out.print(count-1);

        }
    }