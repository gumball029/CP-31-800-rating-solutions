import java.util.Scanner;
 
public class CP31_1896A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr;
        String[] res = new String[t];
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
            res[i] = solution(arr);
        }
        for(int i = 0; i < t; i++){
            System.out.println(res[i]);
        }
    }
    static String solution(int[] arr){
        return arr[0] == 1 ? "YES" : "NO";
    }
}
