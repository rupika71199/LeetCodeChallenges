class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int altitude[] = new int[len+1];
        altitude[0] = 0; 
        int k=1; 
        for(int i=0;i<len;i++){
            altitude[k] = altitude[k-1]+gain[i];
            k++;
        }
        int max =  altitude[0];
        for(int i=0;i<len+1;i++){
            if(max<altitude[i])
                max=altitude[i];
        }
        return max;
    }
}