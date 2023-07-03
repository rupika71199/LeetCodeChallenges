class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        boolean inc = true, dec = true;
        for(int i=1;i<len;i++){
            if(!(nums[i]>=nums[i-1])){
                inc= false;
                break;
            }
                
        }
        for(int j=len-1;j>0;j--){
            if(!(nums[j]<=nums[j-1])){
                dec=false;
                break;
            }     
        }
        if(inc==false && dec==false)
            return false;
        else
            return true;
    }
}