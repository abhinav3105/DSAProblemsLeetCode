class Solution {
    public char repeatedCharacter(String S) {
        int idx = S.length();
        for(int i = 0;i<S.length();i++){
            // int cnt = 0;
            for(int j = i+1;j<S.length();j++){
                //if(i==j) continue;
                if(S.charAt(i)==S.charAt(j)){
                    if(j<idx) idx = j;
                    break;
                }
            }
        }
        return S.charAt(idx);
    }
}