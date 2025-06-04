class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {-1,-1};
        int x = -1;
        set.add(nums[0]);
        for(int i = 1;i<nums.length;i++){
            x = target-nums[i];
            if(set.contains(x)){
                arr[1] = i;
                break;
            }
            set.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==x){
                arr[0] = i;
                break;
            }
        }
        return arr;
    }
}