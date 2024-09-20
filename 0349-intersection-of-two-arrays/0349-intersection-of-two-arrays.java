class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> resList = new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                if(resList.contains(nums1[i])){
                    i++;
                    j++;
                }
                else{
                resList.add(nums1[i]);
                i++;
                j++;
                }
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] res = new int[resList.size()];
        for(int x = 0; x < resList.size(); x++){
            res[x] = resList.get(x);
        }

        return res;
    }
}