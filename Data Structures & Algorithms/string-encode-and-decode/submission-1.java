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
            String word = "";
            for(int k=1;k<=len;k++)
            {   
                word+=str.charAt(j+k);
            }
            i=j+len+1;
            decoded.add(word);

        }
        return decoded ;
    }
}
