import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Passenger Name");
        String name = sc.nextLine();
        System.out.println("Enter the Place");
        String place = sc.nextLine();
        if (!(place.equalsIgnoreCase("Beach") || place.equalsIgnoreCase("Pilgrimage")
                || place.equalsIgnoreCase("Heritage") || place.equalsIgnoreCase("Hills")
                || place.equalsIgnoreCase("Falls") || place.equalsIgnoreCase("Adventures"))) {
            System.out.println(place + " is invalid place");
            System.exit(0);
        }
        System.out.println("Enter the no of Days");
        int days = sc.nextInt();
        if (days <= 0) {
            System.out.println(days + " is invalid days");
            System.exit(0);
        }
        System.out.println("Enter the no of Tickets");
        int numberOfTickets = sc.nextInt();
        if (numberOfTickets <= 0) {
            System.out.println(days + " is invalid tickets");
            System.exit(0);
        }
        double totalAmount = 0.0;
        if (place.equalsIgnoreCase("Beach")) {
            totalAmount = 270.0 * numberOfTickets;
        }
        if (place.equalsIgnoreCase("Pilgrimage")) {
            totalAmount = 350.0 * numberOfTickets;
        }
        if (place.equalsIgnoreCase("Heritage")) {
            totalAmount = 430.0 * numberOfTickets;
        }
        if (place.equalsIgnoreCase("Hills")) {
            totalAmount = 780.0 * numberOfTickets;
        }
        if (place.equalsIgnoreCase("Falls")) {
            totalAmount = 1200.0 * numberOfTickets;
        }
        if (place.equalsIgnoreCase("Adventures")) {
            totalAmount = 4500.0 * numberOfTickets;
        }

        if (totalAmount >= 1000) {
            double discount = totalAmount * 0.15;
            totalAmount = totalAmount - discount;
        }
        System.out.printf("Bill Amount is %.2f", totalAmount);
    }
}