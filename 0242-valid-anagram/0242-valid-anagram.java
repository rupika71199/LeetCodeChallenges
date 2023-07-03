class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char tch[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(tch);
         if(new String(ch).equals(new String(tch)))
	        return true;
	    else 
	        return false;
    }
}