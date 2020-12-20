"55. Jump Game" from Leetcode

class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=1;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int x=nums[j];
                if(x>=(i-j))
                    dp[i]=dp[j]|dp[i]; 
                
            }
        }
        
        if(dp[n-1]==1)
            return true;
        return false;
    }
}