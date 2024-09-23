class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length == 1) return arr[0];
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i = 1;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<Math.min(arr[i].length(),sb.length());j++){
                if(sb.charAt(j) == arr[i].charAt(j)) c++;
                else break;
            }
            //sb = sb.substring(0, c);
            if(c<min) min = c;
        }
        if(min == 0) return "";
        String ans = sb.substring(0, min);
        return ans;
    }
}