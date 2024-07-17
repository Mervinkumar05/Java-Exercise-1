import java.util.*;
public class Program5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first Integer: ");
int a = sc.nextInt();
System.out.println("Enter the second Integer: ");
int b = sc.nextInt();
System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
System.out.println("The difference of "+a+" and "+b+" is: "+(a-b));
System.out.println("The product of "+a+" and "+b+" is: "+(a*b));
float div = a/b;
System.out.println("The division of "+a+" and "+b+" is: "+div);
}
}