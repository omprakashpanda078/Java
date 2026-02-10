import java.util.*;
public class HallowRectangle {
    public static void hallowRect(int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == 0 || i == n-1) {
                    System.out.print("*");
                }
                if(i > 0 && j == 0 && i < n-1) {
                    System.out.print("*");
                } 
                if(i > 0 && j > 0 && i < n-1 && j < m-1) {
                    System.out.print(" ");
                }
                if(i > 0 && j == m-1 && i < n-1) {
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n");
        int n = sc.nextInt();
        System.out.println("Enter the value for m");
        int m = sc.nextInt();
        System.out.println("The hallow rectangle is given below:---");
        hallowRect(n, m);
    }
}
