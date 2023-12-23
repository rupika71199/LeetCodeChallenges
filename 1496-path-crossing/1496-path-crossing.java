class Solution {
    public boolean isPathCrossing(String path) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> pathVal= new ArrayList<Integer>();
        int i = 0, j = 0; 
        pathVal.add(i);
        pathVal.add(j);
        paths.add(pathVal);
        for(int k=0;k<path.length();k++){
            pathVal = new ArrayList<Integer>();
            if(path.charAt(k)=='N'){
                j+=1; 
            }
            else if(path.charAt(k)=='S'){
                j-=1;
            }
            else if(path.charAt(k)=='W'){
                i-=1;
            }
            else if(path.charAt(k)=='E'){
                i+=1; 
            }
            pathVal.add(i);
            pathVal.add(j);
            
            if(paths.contains(pathVal)){
                return true; 
            }
            paths.add(pathVal);
        }
        return false; 
    }
}