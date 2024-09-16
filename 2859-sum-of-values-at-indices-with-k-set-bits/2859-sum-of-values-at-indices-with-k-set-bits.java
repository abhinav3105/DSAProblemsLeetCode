class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.size();i++){
            int count = 0;
            int n = i;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            if(count==k) sum+=nums.get(i);
        }
        return sum;
    }
}