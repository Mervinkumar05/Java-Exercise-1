import java.util.*;
public class Program13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Account obj1 = new Account();
obj1.balance=5000;
obj1.debit(9500);
}
}
class Account{
int balance;
public void debit(int amount){
if(amount>balance){
System.out.println("Debit amount exceeded account balance.. your balance is: "+balance);
}
else{
balance=balance-amount;
System.out.println("Your balance after debit is: "+balance);
}
}
}