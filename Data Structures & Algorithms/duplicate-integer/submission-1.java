class Solution {
    public boolean hasDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
            for(int k :nums)
            {
                if(seen.contains(k))
                {
                    return true;
                }
                else {
                    seen.add(k);
                }
            }
            return false;

    }
}