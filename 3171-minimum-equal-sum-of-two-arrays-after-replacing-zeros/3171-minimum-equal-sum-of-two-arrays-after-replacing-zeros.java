class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long c1 = 0;
        long c2 = 0;
        long s1 = 0;
        long s2 = 0;
        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]==0) c1++;
            s1+=(long)nums1[i];
        }
        for(int i = 0;i<nums2.length;i++){
            if(nums2[i]==0) c2++;
            s2+=(long)nums2[i];
        }
        if(s1==s2 && c1 == c2) return (long)s1+(long)c1; 
        if(s2>s1 && s2<s1+c1 && c2 == 0 || s1>s2 && s1<s2+c2 && c1 == 0 || s1<=s2 && c1==0 || s2<=s1 && c2 == 0 ) {
            return -1;
        }
        if((long)s1+(long)c1>(long)s2+(long)c2) return (long)s1+(long)c1;
        if((long)s1+(long)c1<(long)s2+(long)c2) return (long)s2+(long)c2;
       return (long)s1+(long)c1;
    }
}