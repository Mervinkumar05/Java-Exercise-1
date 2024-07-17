import java.text.DecimalFormat;
import java.util.*;
public class Program12{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double[] grades = new double[20];
int count = 0;
for (int i = 0; i < 20; i++) {
            double input = sc.nextDouble();
            if (input == -1) {
                break;
            }
            grades[count] = input;
            count++;
        }
System.out.print("Entered grades are: ");
for(int i=0;i<count;i++){
System.out.print(grades[i]+" ");
}
double average = Average(grades,count);
DecimalFormat df = new DecimalFormat("#.##");
String formattedAverage = df.format(average);
System.out.println("\n Average: " + formattedAverage);
}

public static double Average(double[] grades, int count){
double average=0;
double sum=0;
for(int i=0;i<grades.length;i++){
sum+=grades[i];
}
average+=sum/count;
return average;
}
}


