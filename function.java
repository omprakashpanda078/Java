import java.util.*;

public class function {
    public static int multiply(int a, int b) {
        int multiply = a * b;
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("the multiplication of a and b is:"+product);
    }
}