class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = findleft(nums,target);
       int right = findright(nums,target);
    
        return new int[]{left, right};
    }
    int findleft(int [] nums,int target){
        int left=0,right=nums.length-1,index=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
          if(nums[mid] == target) {
            index=mid;
            right=mid-1;
          }
          else 
            if(nums[mid] > target)
            right= mid-1;
          else
            left= mid+1;

        }
        return index;
    }
     int findright(int [] nums,int target){
        int left=0,right=nums.length-1,index=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
          if(nums[mid] == target){
            index=mid;
            left=mid+1;
          }
          else 
            if(nums[mid] > target)
            right= mid-1;
          else
            left= mid+1;

        }
        return index;
    }
}