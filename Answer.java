import java.util.*;
public class Answer  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int FistNumber=sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber=sc.nextInt();
        System.out.println("chose your calculate\n 1.Adition\n 2.Multiplexcation");
         int n=sc.nextInt();
         int Adition=FistNumber+secondNumber;
         int Multiplexcation=FistNumber*secondNumber;
         int Div=FistNumber/secondNumber;
         boolean max=FistNumber<secondNumber;



        Calculater1 calculater1=new Calculater1(FistNumber,secondNumber,Adition,Multiplexcation);
        if(n==1){
            
            
        }else if(n==2){
            
           
        }
  // calculater1.ans();

    }
}
