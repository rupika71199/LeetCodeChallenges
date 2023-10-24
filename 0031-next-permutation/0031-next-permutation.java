class Solution {
    public static int[] reversing(int arr[],int start, int end) {
		for(int i=start;i<=((end-start)/2)+start;i++) {
			int temp = arr[i];
			arr[i] = arr[end-i+start];
			arr[end-i+start] = temp;
		}
		return arr;
	}

    public void nextPermutation(int[] nums) {
        int index = -1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				index = i;
				break;
			}
		}
		
		if(index==-1) {
			reversing(nums,0,nums.length-1);
		}
		else {
			for(int i=nums.length-1;i>=index;i--) {
				if(nums[i]>nums[index]) {
					int temp = nums[i];
					nums[i] = nums[index];
					nums[index] = temp;
					break;
				}
			}
			reversing(nums,index+1,nums.length-1);
		}
    }
}