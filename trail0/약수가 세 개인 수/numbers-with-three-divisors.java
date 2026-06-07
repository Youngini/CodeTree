import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int total = 0;
        boolean[] isPrime = new boolean[1001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // prime 수를 구한 뒤, 해당 prime 수의 제곱이 해당 범위에 속하면 total++
        for(int i = 2; i * i <= end; i++){
            if(isPrime[i]){
                if((i * i >= start) && (i * i <= end)){
                    total++;
                }
                for(int j = 2; i * j <= end; j++){
                    isPrime[j * i] = false;
                }
            } 
        }
        System.out.println(total);
    }
}