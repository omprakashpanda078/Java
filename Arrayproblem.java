import java.util.*;

public class Arrayproblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of names");
        int size = sc.nextInt();
        String[] name = new String[size];
        // input
        System.out.println("Give the names");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        // output
        for (int i = 0; i < name.length; i++) {
            System.out.println("names you entered are: " + name[i]);
        }
    }
}