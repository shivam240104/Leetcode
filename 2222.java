class Solution {
    public long numberOfWays(String s) {
        long n = s.length();
        long ans = 0;
        long total0 = 0;
        long total1 = 0;
        for (char ch : s.toCharArray()) {
            if (ch=='0') {
                total0++;
            } else {
                total1++;
            }
        }
        long curr0 = s.charAt(0) == '0' ? 1 : 0;
        long curr1 = s.charAt(0) == '1' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '0') {
                ans += curr1 * (total1 - curr1);
                curr0++;
            } else {
                ans += curr0 * (total0 - curr0);
                curr1++;
            }

        }
        return ans;
    }
}
