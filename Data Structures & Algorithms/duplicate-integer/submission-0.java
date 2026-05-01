class Solution {
    public boolean hasDuplicate(int[] nums) {
        return ifDuplicatePresent(nums);    
    }
  static boolean ifDuplicatePresent(int[] nums){
        Map<Integer,Integer> map = new HashMap();
        for( int n : nums){
            if(map.containsKey(n)){ return true; }
            else{
                map.put(n,n);
            }
        }
        return false;
    }
}