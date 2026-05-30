class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return ""; 
        StringBuilder encoded = new StringBuilder();
        for (String s:strs)
        {
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }
        return encoded.toString();


    }

    public List<String> decode(String str) {
        if(str.length()==0)
        {
            return new ArrayList<>();
        }
        List<String> decoded = new ArrayList<>();
        int i=0;
        while (i<str.length())
        {
            int j =i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            int end = start + len;
            String word = str.substring(start,end);
            
            i=end;
            decoded.add(word);

        }
        return decoded ;
    }
}
