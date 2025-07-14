class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        for i in range (len(numbers)):
            if (target-numbers[i]) in numbers:
                x=(target-numbers[i])
                y=i
                break
            
        for i in range (len(numbers)):
            if x==numbers[i]:
                z=i
        return [y+1,z+1]
        
        
                
