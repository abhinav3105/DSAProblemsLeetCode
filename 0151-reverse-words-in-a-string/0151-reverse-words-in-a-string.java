class Solution {
    public String reverseWords(String s) {
        
        String t = s.replaceAll("\\s+"," ").trim();
        int l = t.length();
        String ans = "" ;
        for(int i = t.length()-1;i>=0;i--){
            if(t.charAt(i)== ' '){
                for(int j = i+1;j<l;j++){
                    ans+=t.charAt(j);
                }
                l = i;
                ans+=' ';
            }
        }
        for(int i = 0;i<l;i++){
            ans+= t.charAt(i);
        }        return ans;
    }
}