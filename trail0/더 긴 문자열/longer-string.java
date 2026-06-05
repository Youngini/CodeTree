import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n1 = a.length();
        int n2 = b.length();

        if(n1 > n2) System.out.printf("%s %d", a, n1);
        else if(n1 < n2) System.out.printf("%s %d", b, n2);
        else System.out.println("same");
    }
}