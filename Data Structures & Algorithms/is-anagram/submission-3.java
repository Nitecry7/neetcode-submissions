class Solution {
    public boolean isAnagram(String s, String t) 
    {
        
        if(s.length() != t.length())
        {
            return false;
        }

        int [] occurences = new int [26];
    
        
        char letter;
        int index = 0;

       for(int i = 0; i < s.length(); i++)
       {
            letter = s.charAt(i);
            index = (char)letter - 97;
            occurences[index] += 1;

            letter = t.charAt(i);
            index = (char)letter - 97;
            occurences[index] -= 1;

       }


       for(int k = 0; k < occurences.length; k++)
       {
            if(occurences[k] != 0)
            {
                return false;
            }
       }

        return true;
    }
}
