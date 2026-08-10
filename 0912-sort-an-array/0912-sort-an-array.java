class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
      mergesort(low,high,nums);
      return nums;
    }
    public void mergesort(int low , int high , int[] nums){
      if (low >= high) return;      
   int mid = low + (high - low)/2;
   mergesort(low, mid, nums);
   mergesort(mid + 1, high, nums); 
   merge(nums,low,mid,high);                    
    } 
    public void merge(int[] nums , int left, int mid,int right){
        int ar[] = new int[right - left + 1];
        int n = right - left + 1;
        int t = 0;
        int j = left;
        int x = mid+1;
        while(left <= mid && x <= right){
        if(nums[left] >= nums[x]){
        ar[t++] = nums[x++];
        }
        else
           if(nums[left] <= nums[x])
        {
            ar[t++] = nums[left++];
        }
        }
      while(left <= mid){
           ar[t++] = nums[left++];
      }
      while(x <= right){
            ar[t++] = nums[x++];
      }
    
      for(int i = 0 ;i<n ;i++ ){
        nums[j]=ar[i];
        j++;
      }
       
    }

}