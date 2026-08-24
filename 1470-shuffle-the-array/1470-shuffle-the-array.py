class Solution(object):
    def shuffle(self, nums, n):
        result = []
        result1 = []
        a = 0
        b = 0
        for i in range(n):
            result.append(nums[i])
        for i in range(n,2*n):
             result1.append(nums[i])
        for i in range(2*n):
            if i % 2 == 0:
             nums[i] = result[a]
             a+=1
            else:
              nums[i] = result1[b] 
              b+=1

        return nums    
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        