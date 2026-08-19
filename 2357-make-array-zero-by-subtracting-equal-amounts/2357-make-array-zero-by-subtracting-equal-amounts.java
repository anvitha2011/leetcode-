class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int n[] = new int[nums.length];
        n[0] = nums[0];
        int a =1;
        for(int i=1 ;i<nums.length ; i++){
            if(nums[i-1] != nums[i] ){
            n[a] = nums[i];
            a++;
            }
        }
         int count = 0;
        for(int i=0 ; i<n.length ; i++){
           if(n[i] != 0)
           count++;
        }
        return count;
    }
}