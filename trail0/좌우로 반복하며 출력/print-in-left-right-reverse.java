import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                for(int j = 1; j < N + 1; j++){
                    System.out.printf("%d", j);
                }
            }
            else{
                for(int j = N; j > 0; j--){
                    System.out.printf("%d", j);
                }
            }
            System.out.println();
        }
    }
}