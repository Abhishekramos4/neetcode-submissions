class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftH = new int[n];
        int[] rightH = new int[n];
        leftH[0] = 0;
        rightH[n-1] = 0;
        for (int i =1 ;i<n;i++)
        {
            int maxAvl = Math.max(leftH[i-1],height[i-1]);
            leftH[i]= height[i]<maxAvl ? maxAvl : 0;
            
        }

        for (int i =n-2 ;i>=0;i--)
        {
            int maxAvl = Math.max(rightH[i+1],height[i+1]);
            rightH[i]= height[i]<maxAvl ? maxAvl : 0;
            
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(leftH[i]);
        }
        int capacity = 0 ;

        for(int i =1;i< n-1; i++)
        {
            if(leftH[i]!=0 && rightH[i]!=0)
            {
                capacity+= Math.min(leftH[i],rightH[i]) -  height[i];
            }
            
        }

        return capacity;

    }
}
