class Solution {
    public int maxSubArray(int[] nums) {
     int maxSum = Integer.MIN_VALUE;
		int sum = 0, valueStart = -1, valueEnd = -1, start=0;
		for(int i=0;i<nums.length;i++) {
			if(sum==0) 
				start = i;
			sum+=nums[i];
			
			if(maxSum<sum) {
				maxSum = sum;
				valueStart = start;
				valueEnd = i;
			}
			
			if(sum<0) {
				sum = 0;
			}
		}
		for(int i=valueStart;i<=valueEnd;i++) {
			System.out.print(nums[i]+" ");
		}
		return maxSum;
    }
}