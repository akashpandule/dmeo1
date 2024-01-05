import java.util.*;
public class TwoIndexString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        String str=sc.next();
        int len=str.length();
        System.out.println("Enter the two indicate ");
          int a=sc.nextInt();
        if(a>len){
            System.out.println(a+"is grter then the index Word");
            return;
        }
        int b=sc.nextInt();
        if(b>len){
            System.out.println(b+"is grter then word lenght");
            return;
        }
        if(a<=b){
            System.out.println("Index2 should bbe grether then index1");
        }else{
            System.out.println(str.substring(a,b));
        }

    }
}
