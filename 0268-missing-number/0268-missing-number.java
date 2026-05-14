class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int nums1[] = new int[nums.length+1];
          int nums2[] = new int[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            nums1[i]=i;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=nums.length;j++){
                if(nums[i]==nums1[j]){
                    nums1[j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<=nums.length;i++){
            if(nums1[i]!=0){
                nums2[count]=nums1[i];
                count++;

            }
        }
        int num = nums2[0];
        return num;
    }
}