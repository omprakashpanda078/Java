import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        // outer loop
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
