import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            if(n < 25) System.out.println("Higher");
            else if(n == 25){
                System.out.println("Good");
                break;
            }
            else System.out.println("Lower");
            n = sc.nextInt();
        }
    }
}