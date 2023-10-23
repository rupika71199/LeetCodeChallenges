class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> result = new ArrayList<List<Integer>>();
		 List<Integer> value = new ArrayList<Integer>();
		 value.add(1);
		 result.add(value);
		 int ind = 1;
		 while(ind<numRows) {
			 value = new ArrayList<Integer>();
			 value.add(1);
			// System.out.println("Ind "+ind);
			 if(ind>1) {
				 List<Integer> prev = result.get(ind-1);
				 //System.out.println(prev);
				 for(int i=0;i<prev.size()-1;i++) {
					 int sum = prev.get(i)+prev.get(i+1);
					 value.add(sum);
				 }
			 }
			 value.add(1);
			 result.add(value);
			 ind++;
		 }
		return result;
    }
}