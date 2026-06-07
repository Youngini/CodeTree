import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i < 16; i++){
            if(sc.nextInt() % 5 == 0) total++;
        }
        System.out.println(total);
    }
}