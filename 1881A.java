import java.util.*;
 
public class CP_1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
 
            System.out.println(solve(x, s));
        }
        sc.close();
    }
 
    static int solve(String x, String s) {
        if (x.contains(s)) return 0;
 
        String current = x;
        for (int i = 1; i <= 6; i++) {
            current = current + current;
            if (current.contains(s)) {
                return i;
            }
        }
        return -1;
    }
}
