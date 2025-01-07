package Codeforces;

import java.util.*;

public class CP31_1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr;
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            res[i] = solution(arr);
        }
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
    static String solution(int[] arr) {
        if (arr.length <= 2) return "Yes";

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        if (freq.size() > 2) return "No";
        if (freq.size() == 1) return "Yes";

        List<Integer> freqs = new ArrayList<>(freq.values());
        return Math.abs(freqs.get(0) - freqs.get(1)) <= 1 ? "Yes" : "No";
    }
}
