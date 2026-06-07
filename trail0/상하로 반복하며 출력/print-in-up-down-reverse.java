import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            // 홀수 열
            if(i % 2 == 0){
                for(int j = 0; j < N; j++){
                    arr[j][i] = j + 1;
                }
            }
            // 짝수 열
            else{
                for(int j = N - 1; j >= 0; j--){
                    arr[j][i] = N - j;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}