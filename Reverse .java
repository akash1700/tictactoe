import java.util.Scanner;
public class Reverse {

        public static void main(String[] args)
        {


            System.out.println("Enter the string");
                    Scanner scan= new Scanner(System.in);
            String name=scan.nextLine();
            char[] str=name.toCharArray();
            
            int size=name.length();
            String revious=" ";
            for (int j=size-1;j>=0;j--){

                 revious=revious+name.charAt(j);
            }
            System.out.println(revious);
                }
            }
















