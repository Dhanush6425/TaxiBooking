import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading N (number of taxis) and P (number of pickup points)
        int N = sc.nextInt();
        int P = sc.nextInt();

        // Reading distances between pickup points
        int[] distances = new int[P - 1];
        for (int i = 0; i < P - 1; i++) {
            distances[i] = sc.nextInt();
        }

        // Reading times between pickup points
        int[] travelTimes = new int[P - 1];
        for (int i = 0; i < P - 1; i++) {
            travelTimes[i] = sc.nextInt();
        }

        // Reading K, I, X, Y values
        int K = sc.nextInt();
        int I = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Reading number of booking requests B
        int B = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Reading booking requests
        String[][] bookings = new String[B][4];
        for (int i = 0; i < B; i++) {
            String line = sc.nextLine();
            bookings[i] = line.split(" ");
        }

        // Printing inputs for verification (optional)
        System.out.println("N: " + N + ", P: " + P);
        System.out.println("Distances: " + Arrays.toString(distances));
        System.out.println("Travel Times: " + Arrays.toString(travelTimes));
        System.out.println("K: " + K + ", I: " + I + ", X: " + X + ", Y: " + Y);
        System.out.println("Bookings: ");
        for (String[] booking : bookings) {
            System.out.println(Arrays.toString(booking));
        }

        sc.close();
    }
}