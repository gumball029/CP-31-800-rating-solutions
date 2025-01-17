import java.util.Scanner;
 
public class CP31_1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] res = new String[t];
        for(int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            res[j] = solution(arr, n);
        }
        for(int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
    static String solution(int[] arr, int n) {
        if(n == 2) return parityCheck(arr[0], arr[1]) ? "yes" : "no";
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) count++;
        }
        return count % 2 == 0 ? "yes" : "no";
    }
    static boolean parityCheck(int a, int b) {
        return (a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0);
    }
}
