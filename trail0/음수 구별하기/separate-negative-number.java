import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 0) System.out.printf("%d\nminus", N);
        else System.out.printf("%d", N);
    }
}