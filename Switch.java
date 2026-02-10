import java.util.*;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("call akash pati");
            break;
            case 2: System.out.println("call vivek saha");
            break;
            case 3: System.out.println("call omm panda");
            break;
            default:System.out.println("unknown person");
        }
    }
}
