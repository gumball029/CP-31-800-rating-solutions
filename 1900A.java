package Codeforces;

import java.util.*;

public class CP31_1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            ans[i] = solve(s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }

    static int solve(String s) {
        int cnt = 0, dotCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '.') {
                cnt++;
                dotCount++;
            } else {
                cnt = 0;
            }

            if (cnt == 3) {
                return 2;
            }
        }

        return dotCount;
    }
}

