import java.util.*;
public class Program6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first Integer: ");
int a = sc.nextInt();
System.out.println("Enter the second Integer: ");
int b = sc.nextInt();
if(a>b){
System.out.println(a+" is greater than "+b);
}
else if(b>a){
System.out.println(b+" is greater than "+a);
}
else if(a==b){
System.out.println("These numbers are equal.");
}
}
}