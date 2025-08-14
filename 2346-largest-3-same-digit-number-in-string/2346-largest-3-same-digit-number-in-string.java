class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int a = 0;
        int b = 1;
        int max = -1;
        for(int i = 2;i<num.length();i++){
            if(num.charAt(a) == num.charAt(b) && num.charAt(a) == num.charAt(i)){
                String help = "";
                help = help + num.charAt(a);
                help = help + num.charAt(a);
                help = help + num.charAt(a);
                int n = Integer.parseInt(help);
                if(n>max){
                    max = n;
                    ans = help;
                } 
            }
            a++;
            b++;
        }
        return ans;
    }
}