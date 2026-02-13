package CodeForces;

import java.util.Scanner;

public class snacktower {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // total snacks
        boolean[] arrived = new boolean[n + 1]; // remembers which snacks have arrived

        int next = n; // the biggest snack we are waiting to place

        for (int day = 0; day < n; day++) {

            int snack = sc.nextInt();  // snack that fell today
            arrived[snack] = true;     // mark it as arrived

            StringBuilder output = new StringBuilder();

            // place snacks as long as the required one is already present
            while (next > 0 && arrived[next]) {
                output.append(next).append(" ");
                next--; // now wait for the next smaller snack
            }

            System.out.println(output.toString().trim());
        }
    }
}
