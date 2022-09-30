// Time Complexity : N
// Space Complexity : N
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english 

// Your code here along with comments explaining your approach 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return nums;
        }
        
        int[] a=new int[nums.length];
        
        
        
        a[0]=1;
        
        for(int i=1;i<nums.length;i++)
        {
            a[i]=a[i-1]*nums[i-1];
        }
        
        int[] b=new int[nums.length];
        b[nums.length-1]=1;
        
        for(int i=nums.length-2;i>=0;i--)
        {
            b[i]=b[i+1]*nums[i+1];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            a[i]=a[i]*b[i];
        }
        
        return a;
    }
}
