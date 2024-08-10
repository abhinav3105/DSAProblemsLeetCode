class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = idx;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    idx = j+1;
                    count++;
                    break;
                }
            }
        }
        if(count != s.length()){
            return false;
        }
        return true;
    }
}