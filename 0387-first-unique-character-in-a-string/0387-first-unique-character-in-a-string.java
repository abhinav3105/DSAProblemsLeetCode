class Solution {
    public int firstUniqChar(String S) {
        for(int i = 0;i<S.length();i++){
            int cnt = 0;
            for(int j = 0;j<S.length();j++){
                if(i==j) continue;
                else if(S.charAt(i)==S.charAt(j)){
                    cnt++;
                    break;
                }
            }
            if(cnt==0) return i;
        }
        return -1;
    }
}