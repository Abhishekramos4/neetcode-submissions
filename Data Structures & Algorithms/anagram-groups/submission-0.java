class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();

        for (String s : strs)
        {
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            String fStr = Arrays.toString(freq);
            if(!groups.containsKey(fStr))
            {
                groups.put(fStr,new ArrayList<>());
            }
            groups.get(fStr).add(s);
        }

        List<List<String>> ans  = new ArrayList<>();
        for(List<String> anags : groups.values())
        {
            ans.add(anags);
        }
        return ans; 
    }
}
