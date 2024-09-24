class Solution {
    int firstoccurance(int[] arr,int n,int x){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
         while(s<=e){
            if(arr[mid] == x){
                if(mid-1>=0){
                if(arr[mid-1] == x){
                    e = mid-1;
                }
                else{
                    
                    return mid;
                }
                }
                else return mid;
            }
            else if(arr[mid] > x){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }
    int lastoccurance(int[] arr,int n,int x){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
         while(s<=e){
            if(arr[mid] == x){
                if((mid+1) <n ){
                if(arr[mid+1] == x){
                    s = mid+1;
                }
                else{
                    return mid;
                }
                }
                else return mid;
            }
            else if(arr[mid] > x){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int n = nums.length;
        arr[0] = firstoccurance(nums,n,target);
        arr[1] = lastoccurance(nums,n,target);
        return arr;
    }
}