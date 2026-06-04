import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_m = sc.nextInt();
        int A_e = sc.nextInt();
        int B_m = sc.nextInt();
        int B_e = sc.nextInt();

        if((A_m > B_m) && (A_e > B_e)) System.out.println(1);
        else System.out.println(0);
    }
}