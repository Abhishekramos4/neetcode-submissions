class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd  = new int[n];
        int[] rightProd = new int[n];

        Arrays.fill(leftProd,1);
        Arrays.fill(rightProd,1);

        for(int i = 1;i<n;i++)
        {
            leftProd[i]=leftProd[i-1]*nums[i-1];
            rightProd[n-1-i] =rightProd[n-i]*nums[n-i];
        }

        int[] ans = new int[n]; 
        for(int i = 0;i<n;i++)
        {
            ans[i] = leftProd[i]*rightProd[i];
        }

        return ans;




    }
}  
