class Solution {
    public String reverseWords(String s) {
        String regex = "\s+";
        s = s.replaceAll(regex," ");
        s = s.trim();
        String str[] = s.split(" ");
        StringBuffer reverseWord = new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            reverseWord.append(str[i]);
            if(i!=0)
                reverseWord.append(' ');
        }
        return reverseWord.toString();
    
    }
}