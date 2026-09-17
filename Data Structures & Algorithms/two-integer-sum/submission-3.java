class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap <Integer, Integer> indices = new HashMap <>();
        int complement;
        int [] resultIndices = new int [2];

        for(int i = 0; i < nums.length; i++)
        {
            
            complement = target - nums[i]; //5 - 3 = 2

            if(indices.containsKey(complement))
            {
                return new int [] {indices.get(complement), i};
            }
            indices.put(nums[i], i);
        }

        return new int [] {};
        


    }
}
