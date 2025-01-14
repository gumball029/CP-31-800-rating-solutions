import java.util.Scanner;
 
public class CP31_1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] ans = new String[t];
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            ans[i] = solution(a, b, c);
        }
        for(int i = 0; i < t; i++){
            System.out.println(ans[i]);
        }
    }
    static String solution(int a, int b, int c){
        // If number of moves available to Anna (a + c/2) is greater than
        // number of moves available to Katie (b + c/2), Anna wins
        if((long)a + (c+1)/2 > (long)b + c/2) {
            return "First";
        } else {
            return "Second";
        }
    }
}
