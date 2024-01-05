public class Ticket{
    static int ticketid;
    static int price;
    static int availableTickets;
     
    public void get_ticketid(){
        return ticketid;
    }
    public int set_ticketid(int ticketid){
        ticketid=ticketid;
    }
    public void get_price(){
        return price;
    }
    public int set_price(int price){
        price=price;
    }
    public void get_availabletickets(){
        return get_availabletickets;
    }
    public int set_availabletickets(int set_availabletickets){
        get_availabletickets=availabletickets;
    }
    public void CalculateTicket(int notifyticekt){
     if(availableTickets>0 || availableTickets<notifyticekt){
        return -1;
     }
       if(get_availabletickets()>=notifyticekt){
        set_availabletickets(get_availabletickets()-notifyticekt);
        return notifyticekt*get_price;
       }
       return -1;
       public void Display(int notifyticekt){
        System.out.println("Available ticket"+get_availabletickets());
        System.out.println("total amount"+CalculateTicket());
         if(get_availabletickets==0){
            System.out.println("Hous Full");
         }
           }else{
            System.out.println("Available ticket after booking"+get_availabletickets());
           }

    }
    public void Display(int notifyticekt) {
    }
}