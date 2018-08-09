/**
 * 輸入一個陣列與目標值，找出陣列中任兩個數值合計為目標值的資料，並回傳其陣列位置
 */
package twosum;
public class twosum 
{
	public static void main(String[] args)
	{
		 Solution Solution = new Solution();
		 int [] a={2,7,15,11};
		 int[] i = Solution.twoSum(a,9);
		 for(int x=0;x<i.length;x++)
		 {
			 System.out.println(i[x]);
		 }
		 
	}
}
