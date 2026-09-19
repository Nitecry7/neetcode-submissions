class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap <String, ArrayList<String>> tempHashMap = new HashMap <String, ArrayList<String>>();
        

    
        for(String str : strs)
        {
            char [] temp = str.toCharArray();
            Arrays.sort(temp);
            String sortedStr = String.valueOf(temp); 

            tempHashMap.putIfAbsent(sortedStr, new ArrayList<String>()); //if the sortedStr key does not exist, then put the key and an arrayList pair into it. If it exists, don't put it.
            ArrayList<String> group = tempHashMap.get(sortedStr);
            group.add(str);

        }
        
       
        return new ArrayList<>(tempHashMap.values());
    }
}
