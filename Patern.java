import java.util.*;
public class Patern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        try {
            int n1=Integer.parseInt(n);
            for (int i = 1; i < n1; i++) {
                for (int j = n1; j > 1; j--) {
                    System.out.print("*");
                    
                }
                 System.out.println();
            }
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println();
        
    }
}


// here we handle the excetion