class Solution {
    public int countConsistentStrings(String s, String[] w) {
        int arr[] = new int[26];
        for(int i = 0;i<s.length();i++){
            int x = s.charAt(i) - 'a';
            arr[x] = 1;
        }
        int ans = 0;
        for(int i = 0;i<w.length;i++){
            int cnt = 0;
            for(int j = 0;j<w[i].length();j++){
                if(arr[w[i].charAt(j)-'a'] >0) cnt++;
            }
            if(cnt == w[i].length()) ans++;
        }
        return ans;
    }
}