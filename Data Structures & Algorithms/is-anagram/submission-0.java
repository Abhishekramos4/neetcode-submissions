class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charMap = new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        else{
            for(int i =0;i<s.length();i++)
            {
                int idxS  = s.charAt(i)-'a';
                charMap[idxS]++;
                int idxT  = t.charAt(i)-'a';
                charMap[idxT]--;

            } 
            
            for(int i :charMap)
            {
                if(i!=0)
                return false;
            }
            return true;

    }
}
}
