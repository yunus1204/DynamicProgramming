class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        else if (n == 2) return "11";

        String[] s = new String[n];
        s[0] = "1";
        s[1] = "11";

        for (int i = 2; i < n; i++) {
            String temp = s[i - 1];
            char[] arr = temp.toCharArray();
            int len = arr.length;
            int p = 0, q = 0;
            StringBuilder ans = new StringBuilder();

            while (p < len) {
                int co=0;
            
                while (q < len && arr[p] == arr[q]) {
                    q++;
                    co++;
                }

                
                ans.append(co).append(arr[p]);

                
                p = q;
            }

            s[i] = ans.toString();
        }

        return s[n - 1];
    }
}
