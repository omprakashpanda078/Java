
    import java.util.Scanner;

public class test {

    // function to calculate and print average
    static void printAverage(int a, int b, int c, int d) {
        double avg = (a + b + c + d) / 4.0;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int n4 = sc.nextInt();

        // calling the function
        printAverage(n1, n2, n3, n4);
    }
}
