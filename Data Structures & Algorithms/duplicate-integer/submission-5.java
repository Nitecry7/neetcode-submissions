class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> uniqueNums = new HashSet<Integer>();

        for(int num : nums)
        {
            uniqueNums.add(num);
        }

        if(uniqueNums.size() < nums.length)
        {
            return true;
        }
        return false;
    }
}