class Solution(object):
    def fizzBuzz(self, n):
        result = []
        for i in range(1,n+1):
            if(i % 3 == 0 and i% 5 == 0 ):
              result.insert(i,"FizzBuzz")
            elif(i % 3 == 0):
              result.insert(i,"Fizz")
            elif(i % 5 == 0):
              result.insert(i,"Buzz")
            else:
              result.insert(i,str(i))
        return result

        """
        :type n: int
        :rtype: List[str]
        """
        