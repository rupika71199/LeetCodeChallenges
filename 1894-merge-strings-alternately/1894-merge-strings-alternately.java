class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer str1 = new StringBuffer(word1);
        StringBuffer str2 = new StringBuffer(word2); 
        StringBuffer merge = new StringBuffer(); 
        int length1 = str1.length(); 
        int length2 = str2.length(); 
        if(length1 == length2){
            for(int i=0;i<length1;i++){
                merge.append(str1.charAt(i));
                merge.append(str2.charAt(i));
            }
        }
        else if(length1<length2){
            int i;
             for(i=0;i<length1;i++){
                merge.append(str1.charAt(i));
                merge.append(str2.charAt(i));
            }
            for(int j=i;j<length2;j++){
                merge.append(str2.charAt(j));
            }
        }
        else{
            int i;
             for(i=0;i<length2;i++){
                merge.append(str1.charAt(i));
                merge.append(str2.charAt(i));
            }
            for(int j=i;j<length1;j++){
                merge.append(str1.charAt(j));
            }
        }
        return merge.toString();
    }
}