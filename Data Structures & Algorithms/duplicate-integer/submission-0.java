    class Solution {
        public boolean hasDuplicate(int[] nums) {

            HashSet<Integer> hs = new HashSet<Integer>();

            for(int i = 0; i < nums.length; i++)
            {
                if(hs.contains(nums[i]) == true)
                {
                    return true;
                }
                else
                {
                    hs.add(nums[i]);
                }
            
            }
            return false;         

        }
    }