class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> num_map= new HashMap<Integer,Integer>();
        int i=0;
        for(int num:nums)
        {
            if(num_map.containsKey(num))
                return new int[]{num_map.get(num),i};
            num_map.put(target-num,i++);
        }
        return new int[]{0,0};
    }
}
