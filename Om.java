import java.util.*;

public class Om {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for o");
        int o=sc.nextInt();
        System.out.println("enter the value for p");
        int p=sc.nextInt();
        for (int i=1;i<=o;i++){
            for(int j=1;j<=p;j++){
                if(i==1||j==1||i==o||j==p){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
}