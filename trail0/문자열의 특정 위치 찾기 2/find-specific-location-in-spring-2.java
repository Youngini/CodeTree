import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};
        int total = 0;
        for(String fruit : fruits){
            if((fruit.charAt(2) == s.charAt(0)) || (fruit.charAt(3) ==  s.charAt(0))){
                total++;
                System.out.println(fruit);
            }
        }
        System.out.println(total);
    }
}