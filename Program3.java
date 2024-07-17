import java.util.*;
public class Program3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Fahrenheit value: ");
float fahrenheit = sc.nextFloat();
float Celsius  = ((fahrenheit-32)*5)/9;
System.out.println(fahrenheit +" in Celsius is: "+ Celsius);
}
}