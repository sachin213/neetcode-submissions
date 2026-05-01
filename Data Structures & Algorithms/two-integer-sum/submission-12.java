class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result;
        
        for(int i =0 ;i < nums.length ; i++){
            int required = target - nums[i];
            if(map.containsKey(required)){
                int firstIndex = map.get(required);
                return new int[] {firstIndex,i};
            }
            map.put(nums[i],i);        
        }
       return new int[] {};
    }
}
