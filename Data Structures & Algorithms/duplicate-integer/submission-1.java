    class Solution {
        public boolean hasDuplicate(int[] nums) {

            HashSet<Integer> Seen = new HashSet<Integer>();

            for(int i = 0; i < nums.length; i++)
            {
                if(Seen.contains(nums[i]))
                {
                    return true;
                }
                
                Seen.add(nums[i]);
            
            
            }
            return false;         

        }
    }