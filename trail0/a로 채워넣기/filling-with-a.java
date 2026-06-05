import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(1, 'a');
        sb.setCharAt(n-2, 'a');
        System.out.println(sb);
    }
}