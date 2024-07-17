import java.util.*;
public class Program9{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[10];
int counter=0;
int Largest=0;
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
counter++;
System.out.println("The counter value is: "+counter);
System.out.println("Number is: "+arr[i]);
if(arr[i]>Largest){
Largest=arr[i];
}
System.out.println("The Largest number till now is: "+Largest);
}
}
}