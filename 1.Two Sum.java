class Solution {
    public int[] twoSum(int[] nums, int target) {
        int solutuon =0;
        int[] arr = new int[2];
        if(nums.length == 0){
              return null;       
                }
        for(int i =0; i< nums.length -1 ;i++){
            for(int j = i+1;j<nums.length;j++){
                
                if(nums[i] +nums[j] == target){
                     return new int[] {i, j};
                }
            }
        }
        
        return new int[] {1,2};
    }
}