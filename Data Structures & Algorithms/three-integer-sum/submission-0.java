class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        
        List<List<Integer>> resultLists = new ArrayList<>();
        

        if(nums ==null || nums.length < 3) return resultLists;
        Arrays.sort(nums);
        
        int target = 0;
        for(int i =0 ;i < nums.length-2;i++)
        {

        //skip i,j,k
        if (i> 0 && nums[i] == nums[i-1]) continue;

        int j = i+1;
        int k = nums.length -1;       

        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];

            if(target == sum){
                List<Integer> resultList = new ArrayList<>();
                resultList.add(nums[i]);
                resultList.add(nums[j]);
                resultList.add(nums[k]);
                resultLists.add(resultList);

                while(j  < k && nums[j] == nums[j+1]) j++;
                while(j <k && nums[k] == nums[k-1]) k--;

                j++;
                k--;
            }
            else if(sum > target){
                k--;
            }
            else if(sum < target){
                j++;                
            }
        }}
        return resultLists;
    }
    
}
