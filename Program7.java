import java.util.*;
public class Program7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = sc.nextInt();
System.out.println("Enter the second number: ");
int b = sc.nextInt();
System.out.println("Enter the third number: ");
int c = sc.nextInt();
int sum=a+b+c;
int product=a*b*c;
float avg = sum/3;
System.out.println("The sum is: "+sum);
System.out.println("The product is: "+product);
System.out.println("The average is: "+avg);
if(a>b && a>c){
System.out.println(a+" is greater");
}
else if(b>a && b>c){
System.out.println(b+" is greater");
}
else if(c>a && c>b){
System.out.println(c+" is greater");
}
if(a<b && a<c){
System.out.println(a+" is smaller");
}
else if(b<a && b<c){
System.out.println(b+" is smaller");
}
else if(c<a && c<b){
System.out.println(c+" is smaller");
}
}
}