import java.util.*;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight kg");
        double weight=sc.nextDouble();
        System.out.println("Enter the hight cm");
        double hight=sc.nextDouble();
        double bmi=(weight/(hight*hight));//*100*100;
        if(bmi>25){
            System.out.printf("Your bmi is %.2f.your overwiht\n",bmi);
            System.out.printf("reduce %.2f kg to fit",bmi-25);
        }else if(bmi>18.5){
            System.out.printf("your bmi is %.2f.underwight",bmi);
            System.out.printf("gain %.2f. kg to be fit",18.5-bmi);
        }else{
            System.out.printf("your bmi is %.2f.your fit and helthy\n",bmi);
        }

    }
}
