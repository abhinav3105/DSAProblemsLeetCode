class Solution {
    public boolean canArrange(int[] arr, int k) {
        if(arr.length%2 != 0) return false;
        int help[] = new int[k];
        for(int i = 0;i<arr.length;i++){
            int x = arr[i]%k;
            if(x<0) x+=k;
            help[x]++ ;
        }
        if(help[0]%2!=0) return false;

        for(int i = 1; i<=k/2;i++){
            if(help[i] != help[k-i]) return false;
        }
        return true;
    }
}