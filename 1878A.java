import java.util.Scanner;
 
public class CP31_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            boolean b = false;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
            res[i] = isValid(k, arr);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
    static String isValid(int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return "YES";
            }
        }
        return "NO";
    }
}
