class Solution {
    public int[] runningSum(int[] nums) {
        int []ar = new int[nums.length];
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(i == 0){
                ar[i] = nums[i];
            }
            else{
            sum = sum + nums[i-1];
            ar[i] = nums[i]+sum;
            }
        }
        return ar;
    }
}