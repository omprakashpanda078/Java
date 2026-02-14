import java.util.*;

public class Sum {

    static void printOddSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOddSum(n);
    }
}
