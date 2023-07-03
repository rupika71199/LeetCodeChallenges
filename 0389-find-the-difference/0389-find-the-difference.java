class Solution {
    public char findTheDifference(String s, String t) {
        int sAscii = asciSum(s);
        int tAscii = asciSum(t);
        return ((char)(tAscii-sAscii));
    }
     private int asciSum(String s) {
    	int sum=0;
    	for(int i=0;i<s.length();i++) {
    		sum+=(int)s.charAt(i);
    	}
    	return sum;
    }
}