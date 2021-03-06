class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int current =0;
        for(int i =0; i< nums.length; i++){
           current = nums[i];
            if(count.containsKey(current)){
                count.put(current, count.get(current)+1);
            }
            
            else{
                count.put(current,1);
            }
        }
        
        for(int i = 0; i<nums.length;i++){
            if(count.get(nums[i]) == 1){
                return nums[i];
            }
        }
      return -1;
    }
}