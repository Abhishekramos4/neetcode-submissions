class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();  
        int ans = 0 ;
        if(nums.length == 0)
        {
            return ans;
        }
        for(int n : nums)
        {
            seen.add(n);
        }

        for(int n: seen)
        {
            if(!seen.contains(n-1))
            {
                int streak = 1;
                int curr = n;
                while(seen.contains(curr+1))
                {
                    streak++;
                    curr++;
                }
                ans=Math.max(streak,ans);

            }
        }

        return ans;


    }
}
