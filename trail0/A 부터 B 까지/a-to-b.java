import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A;
        while(n <= B){
            System.out.printf("%d ",n);
            if(n % 2 == 1) n *= 2;
            else n += 3;
        }
    }
}