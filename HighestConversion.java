import java.util.*;
public class HighestConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cm=sc.nextDouble();
        double foot=cm/30.48;
        
        System.out.printf("%.3f",foot);
    }
}
// System.out.printf() - prints with formatting. This is more complex, but more agile command.
// %s used as simple placeholder for string (described in accepted answer)
// %S can be used to make text in upper case
// %f for float or double formatting
// %d for integers
// Also possible to format dates and so on.
// Most common case here - printing number with rounding (precision).

// double number = 1.2345678f;
// System.out.printf("%.2f", number); // .2 means 2 digits after comma
// prints 1.23 instead of 1.2345678