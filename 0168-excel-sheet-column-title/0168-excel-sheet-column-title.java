class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder resultBuilder = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char value = (char)('A'+ columnNumber%26);
            resultBuilder.insert(0,value);
            columnNumber/=26;
        }
        return resultBuilder.toString();
    }
}