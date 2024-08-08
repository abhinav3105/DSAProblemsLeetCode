class Solution {
    public String reverse(String r){
        char ch;
        String rev = "";
        for (int i=0; i<r.length(); i++)
      {
        ch= r.charAt(i);
        rev= ch+rev; 
      }
        return rev;
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        String r  = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(reverse(r));
                sb.append(' ');
                r = "";
            }
            else{
            r = r+s.charAt(i);
            }
        }
        sb.append(reverse(r));
        return sb.toString();
    }
}