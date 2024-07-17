import java.util.*;
public class Program11{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] counts = new int[10];
Arrays.fill(counts,0);
for(int i=0;i<10;i++){
System.out.print(counts[i]+" ");
}
System.out.println();
int[] bonus = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
for(int i=0;i<15;i++){
bonus[i]+=1;
System.out.print(bonus[i]+" ");
}
System.out.println();
int[] bestScores = {30,20,25,11,5};
for(int i=0;i<5;i++){
System.out.println(bestScores[i]+" ");
}
}
}