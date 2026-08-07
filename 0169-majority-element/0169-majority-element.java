class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote = 1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] == majority)
            vote++;
            else
            vote--;
            if(vote == 0){
                vote++;
            majority = nums[i];
            
            }
        }
        return majority;
    }
}