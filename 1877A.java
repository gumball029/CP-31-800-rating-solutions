import java.util.Scanner;
 
public class CP31_1877A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n - 1];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = sc.nextInt();
            }
            res[i] = solution(arr);
        }
        for(int i = 0; i < t; i++){
            System.out.println(res[i]);
        }
    }
    static int solution(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return -1 * sum;
    }
}
