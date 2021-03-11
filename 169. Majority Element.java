class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        int criteria = nums.length/2;
        
        
        int exit_criteria = (nums.length/2) +1;
        
        
        for(int i =0; i<nums.length;i++){
            
            
            if(count.containsKey(nums[i]) && count.get(nums[i]) <= criteria ){
                count.replace(nums[i], count.get(nums[i]) + 1);
                System.out.println("value increased");
            
        }
            else if (!count.containsKey(nums[i])){
                System.out.println("New element added to hashmap");
                count.put(nums[i], 1);
            }
            
            
            
            
            if(count.containsKey(nums[i]) && count.get(nums[i]) > criteria ){
                System.out.println("Element found occuring "+count.get(nums[i]));
                
                for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if (exit_criteria == entry.getValue() ) {
				return entry.getKey();
			}
		}
                            
                
            }
            

        }
        
        
        return 0;
        
        
    }
}