class Solution {
    public int singleNumber(int[] nums) {
				Map<Integer,Integer> maps = new HashMap<>();
				for(int val:nums){
					 maps.put(val,maps.getOrDefault(val,0)+1);
				}
				System.out.print(maps);
				for(Map.Entry<Integer,Integer> entry:maps.entrySet()){
                    if(entry.getValue()==1)
                        return entry.getKey();
                }
				return 0;
		}
}
