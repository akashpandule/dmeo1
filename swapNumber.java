import java.util.*;
class swapNumber{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the number");
       int firstNumber=sc.nextInt();
       int secondNumber=sc.nextInt();
       System.out.println("Befor Swapping Number");
       System.out.println("first= "+firstNumber+" second= " +secondNumber);
       firstNumber=secondNumber ^ firstNumber;
       secondNumber=firstNumber ^ secondNumber;
       firstNumber=firstNumber ^ secondNumber;
       System.out.println("**********************");
       System.out.println("After swapping number");
       System.out.println("first= "+firstNumber+" second= "+secondNumber);
    }
}