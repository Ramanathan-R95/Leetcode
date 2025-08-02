class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        visited =set()
        l=0
        r=0
        for r in range(len(nums)):
            if r < k+1:
                if nums[r] in visited :
                    return True
                visited.add(nums[r])
            else :
                visited.remove(nums[l])
                l+=1
                if nums[r] in visited :
                    return True
                visited.add(nums[r])
        return False


        