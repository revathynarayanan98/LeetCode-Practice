class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> nums = new ArrayList();
        for(int i = 1; i<= n; i++){
            
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
                nums.add("FizzBuzz");
            }
            
             else if(i%3 == 0){
                // System.out.println("Fizz");
                nums.add("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
                nums.add("Buzz");
            }
            
           
            else{
                String s = String.valueOf(i);
                nums.add(s);
            }
        }
         
        
        return nums;
    }
}