import java.util.Scanner;
public class switchcase
{
public static void main(String []args)
{
double num1=0,num2=0,result=0;
char ch;
float s;
Scanner sc =new Scanner(System.in);
System. out . println("Enter the first number");
num1=sc.nextDouble();
System. out . println("Enter the second number");
num2=sc.nextDouble();
System. out . println("choose the character ' * + / - ' :");
ch=sc.next().charAt(0);

switch(ch){
case'*':
result=num1*num2;
System. out . println("the result is :"+result);
break;
case'+':
result=num1+num2;
System. out . println("the result is :"+result);
break;
case'/':
result=num1/num2;
System. out . println("the result is :"+result);
break;
case'-':
result=num1-num2;
System. out . println("the result is :"+result);
break;
default:
System. out . println("Enter the number is invalid" );
break;
}
}
}