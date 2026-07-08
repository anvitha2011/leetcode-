class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int a=0;
        int c[] = new int[nums.length];
        for(int i=0;i< nums.length; i++){
            if(nums[i] == 1)
            count++;
            else {
             c[a] = count;
             a++; 
             count = count - c[a-1];
            }    
        }
        if(nums[nums.length - 1] == 1){
            c[a] = count;
        }
        int max = c[0];
        for(int j=0;j< c.length ;j++){
            if(c[j]> max)
            max = c[j];

        }

        return max;
    }
}