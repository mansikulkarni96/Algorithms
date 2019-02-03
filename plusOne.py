class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        sum=0
        sum1=[]
        for i in range(0,len(digits)):
            sum=sum+digits[i]*pow(10,len(digits)-1-i)
        return map(int,str(sum+1))
        
            