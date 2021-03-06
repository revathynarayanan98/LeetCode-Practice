class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        else if(nums.length == 0){
            return 0;
        }
        
        int maxsum = nums[0];
        int current = maxsum;
        
        for(int i =1; i<nums.length;i++){
            current = Math.max(nums[i] +current, nums[i]);
            maxsum = Math.max(maxsum, current);
        }
        
        return maxsum;
    }
}