class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' ') cnt++;
            if(cnt<k){
            sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}