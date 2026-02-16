import java.util.*;

public class Circumference {
    public static double printCircumference(double r){
        return 2*3.14*r;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        printCircumference(r);
        System.out.println(printCircumference(r));
    }
}
