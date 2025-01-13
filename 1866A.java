import java.util.*;
 
public class CP31_1866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = Math.abs(a);
        }
        System.out.println(solution(arr));
    }
    static int solution(int[] arr) {
        if(arr.length == 1) return Math.abs(arr[0]);
        Arrays.sort(arr);
        return arr[0];
    }
}
