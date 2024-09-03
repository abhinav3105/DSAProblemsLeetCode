class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for(int i = 0;i<s.length();i++){
            int x = s.charAt(i) - 'a'+1;
            num+= Integer.toString(x);
        }
        for(int i = 0;i<k;i++){
            int y = 0;
            for(int j = 0;j<num.length();j++){
                y+= num.charAt(j) - '0';
            }
            num = Integer.toString(y);
        }
        return Integer.parseInt(num); 
    }
}