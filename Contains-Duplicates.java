class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=nums.length;
        int val=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==nums[i-1])
           {
               return true;
           }
           
            
        }
        return false;
            
        
        
    }
}
