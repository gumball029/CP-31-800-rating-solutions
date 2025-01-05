import java.util.*;
 
public class CP31_1899A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr[i] = solution(n);
        }
        for(int i = 0; i < t; i++){
            System.out.println(arr[i]);
        }
    }
    static String solution(int n) {
        return n % 3 == 0 ? "Second" : "First";
    }
}
