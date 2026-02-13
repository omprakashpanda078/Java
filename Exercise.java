import java.util.*; 
public class Exercise {
    public static float printAverage(int a,int b,int c,int d){
        double average = (a + b + c + d) / 4f;
        System.out.println("Average = " + average);
        return (float) average ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        double sum=printAverage(a,b,c,d);
    }
}
