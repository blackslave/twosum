/**
 * �g�p��珚��C�\�͖@�䛔~~~
 */
package twosum;
public class Solution 
{
	public int[] twoSum(int[] nums, int target) 
	{
		int i,j;
	    for(i=0;i<nums.length;i++)
	    {
	    	for(j=i+1;j<nums.length;j++)
	    	{
	    		if(nums[i]+nums[j]==target)
	    		{
	    			int [] a={i,j};
	    			return a;
	    		}
	    	}
	    }
	    return null;
	}
}
