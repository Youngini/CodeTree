import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0 ; i < 10; i++) arr[i] = sc.nextInt();
        int[] total = {0, 0};
        for(int a : arr){
            if(a % 3 == 0) total[0]++;
            if(a % 5 == 0) total[1]++;
        }
        System.out.printf("%d %d", total[0], total[1]);
    }
}