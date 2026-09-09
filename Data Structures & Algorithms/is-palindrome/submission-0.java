class Solution {

    public boolean isValidChar(char ch)
    {
        if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9')) return true;
        return false;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int i =0;
        int j =n-1;

        while(i<j)
        {
            char chL = s.charAt(i);
            char chR = s.charAt(j);
            if(!isValidChar(chL))
             i++;

            if(!isValidChar(chR)) 
             j--;

            if(isValidChar(chL) && isValidChar(chR) )
            {
                if(Character.toLowerCase(chL) == Character.toLowerCase(chR))
                {
                    i++;
                    j--;
                }
                else{
                    return false; 
                }
            }    
        }

        return true;
    }
}
