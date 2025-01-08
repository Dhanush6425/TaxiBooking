import java.util.*;

public class accorrej {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("No of taxis:");
        int n = sc.nextInt();
        System.out.println("No of pickup points:");
        int p = sc.nextInt();

        // Input distances between pickup points
        System.out.println("Distance:");
        int[] distance = new int[p - 1];
        for (int i = 0; i < p - 1; i++) {
            distance[i] = sc.nextInt();
        }

        // Input travel times between pickup points
        System.out.println("Travel time:");
        int[] travel = new int[p - 1];
        for (int i = 0; i < p - 1; i++) {
            travel[i] = sc.nextInt();
        }

        
        System.out.println("Enter K, I, X, Y values:");
        int K = sc.nextInt(); 
        int I = sc.nextInt(); 
        int X = sc.nextInt();
        int Y = sc.nextInt(); 

        // Input bookings
        System.out.println("Enter the number of bookings:");
        int B = sc.nextInt();
        sc.nextLine(); 
        String[][] bookings = new String[B][4];
        for (int i = 0; i < B; i++) {
            bookings[i] = sc.nextLine().split(" ");
        }

        // Process each booking
        for (String[] booking : bookings) {
            String customer = booking[0]; 
            int pickup = Integer.parseInt(booking[1]);
            int drop = Integer.parseInt(booking[2]); 
            String reqTime = booking[3]; 

            int totalDistance = calculateDistance(distance, pickup, drop);

            // Check if the booking is accepted or rejected
            if (totalDistance <= K) {
                System.out.println(customer + " ACCEPTED");
            } else {
                System.out.println(customer + " REJECTED");
            }
        }
    }

    // Method to calculate total distance between pickup and drop points
    private static int calculateDistance(int[] distances, int start, int end) {
        int totalDistance = 0;
        for (int i = Math.min(start, end) - 1; i < Math.max(start, end) - 1; i++) {
            totalDistance += distances[i];
        }
        return totalDistance;
    }
}
