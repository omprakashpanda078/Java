import java.util.*;

public class Problem3 {
    public static int printEligibility(int n){
        if(n>=18){
            System.out.println("eligible for voting");
        }else{
            System.out.println("not eligible for voting");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printEligibility(n);
    }
}