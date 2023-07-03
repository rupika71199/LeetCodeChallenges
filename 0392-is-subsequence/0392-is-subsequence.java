class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0, tCou = 0;
        while(count<s.length() && tCou<t.length()){
            if(s.charAt(count)==t.charAt(tCou)){
                count++;
            } 
            tCou++;
        }
        if(!(count==s.length()))
            return false;
        else 
            return true;
            
    }
}