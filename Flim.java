import java.util.*;
public class Flim  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket ticket=new Ticket();
        System.out.println("Enter the movie name");
        int n=sc.nextInt();
        System.out.println("Enter the no of booking");
        int notifyticekt=sc.nextInt();
        System.out.println("Enter the  Avilable ticket");
        int availabletickets=sc.nextInt();
        ticket.CalculateTicket(notifyticekt);
       ticket.set_availabletickets(availabletickets);
        ticket.get_price();
        ticket.Display(notifyticekt);
        

    }
}
