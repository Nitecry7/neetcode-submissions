class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap <Integer, Integer> freq = new HashMap<>();
        

        for(int i = 0; i < nums.length; i++)
        {
            int currNum = nums[i];
            freq.put(currNum, (freq.getOrDefault(currNum,0) + 1));
        }
        
        ArrayList<Integer> [] bucket = new ArrayList[nums.length + 1]; 
        //Why +1? as let's say if the nums array[] has 3 number '1's so 1 -> freq of 3, but bucket[3]   won't exist as size 3 array will have [0][1][2] no [3].
        
        for(int key : freq.keySet())
        {
            if(bucket[freq.get(key)] == null)
            {
                bucket[freq.get(key)] = new ArrayList<>();
            }
            bucket[freq.get(key)].add(key);
        }

        int counter = 0;
        int [] result = new int[k];

        for(int j = bucket.length - 1; j >= 0; j--)
        {
            if(bucket[j] != null)
            {
                for(int val : bucket[j])
                {
                    result[counter] = val;
                    counter++;

                    if(counter == k)
                    {
                        return result;
                    } 
                }
            }
        }

        return result;

    }
}
