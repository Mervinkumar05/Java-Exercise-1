import java.util.*;
public class Program10{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double dia = sc.nextDouble();
double radius = dia/2;
double volume = SphereVolume(radius);
System.out.println("The volume is: "+volume);
}
public static double SphereVolume(double radius){
double volume = (4.0/3.0)*(Math.PI)*Math.pow(radius,3);
return volume;
}
}
