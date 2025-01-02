import java.util.*;

public class CP31_1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            res[i] = Solution(n, x, arr);
        }
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

    static int Solution(int n, int x, int[] arr) {
        if (arr.length == 1){
            return Math.max(arr[0], (x - arr[0]) * 2);
        }
        int index = 0;
        int max = arr[index];
        while (index < n - 1) {
            max = Math.max(max, (arr[index + 1] - arr[index]));
            index++;
        }
        max = Math.max(max, (x - arr[n - 1]) * 2);
        return max;
    }
}
