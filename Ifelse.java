import java.util.*;
// Java is casesensitive  int !=  Int int == int
public class Ifelse {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else{
            if(a>b){
                System.out.println("greater");
            }else{
                if(a<b){
                    System.out.println("lesser");
                }
            }
        }
    }
    
}
