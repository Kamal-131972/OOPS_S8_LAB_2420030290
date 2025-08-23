package lab5;

class Transport {
 public void ticketPrice() {
     System.out.println("Ticket price varies depending on the transport type.");
 }
}

class Bus extends Transport {
 @Override
 public void ticketPrice() {
    System.out.println("Bus ticket price: $50");
 }
}


class Train extends Transport {
 @Override
 public void ticketPrice() {
     System.out.println("Train ticket price: $150");
 }
}


public class Transportation {
 public static void main(String[] args) {
   
     Transport bus = new Bus();   
     Transport train = new Train();

     
     bus.ticketPrice();   
     train.ticketPrice(); 
 }
}
