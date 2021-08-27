import java.util.Scanner;
public class shoeDuplicateChar
{
public static int shoeDuplicateCharacters(int[]ch,int count)
{
for (int i = 0; i < count; i++)
{
for (int j = i + 1; j < count; j++) 
{
if(ch[i]==ch[j])
{
System.out.println("After remove    :"+ch[j]);
}
}
}
return; 
}
public static void main(String[] args)  
{
int count,sum=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter number size  :");
count = scan.nextInt();
int[] ch=new int[count];
System.out.print("Enter number integer  :");
for(int i=0;i<count;i++)
{    
ch[i]= scan.nextInt();        
}
System.out.println("Before remove:");
for(int cc:ch)
{
System.out.println(cc);
}
shoeDuplicateCharacters(ch,count);
}
}