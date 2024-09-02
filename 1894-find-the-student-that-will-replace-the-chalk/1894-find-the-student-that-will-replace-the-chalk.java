class Solution {
    public int chalkReplacer(int[] arr, int k) {
        int i = 0;
        while(k>=0){
            if(i == arr.length){
                i = 0;
            }
            if(k-arr[i]<0) return i;
            k = k-arr[i];
            i++;
        }
        if(i == arr.length ) return 0;
        return i+1;
    }
}