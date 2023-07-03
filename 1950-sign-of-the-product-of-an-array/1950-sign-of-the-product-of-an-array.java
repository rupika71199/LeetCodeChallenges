class Solution {
    public int arraySign(int[] nums) {
        int val = 0,count=0;
        for(int num:nums){
            if(num==0)
                return val;
            else if(num<0)
                count++;
        }
        return (val=(count%2==0)?1:-1);
    }
}