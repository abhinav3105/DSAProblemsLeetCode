class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 1;i<=k;i++){
            int idx = mini(nums);
            nums[idx] = nums[idx]*multiplier;
         }
        return nums;
    }
    public int mini(int[] num ){
        int min = 0;
        for(int i = 1;i<num.length;i++){
            if(num[i]<num[min]) min = i;
        }
        return min;
    } 
}