class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> exists = new HashSet<>();
        while(n != 1){
            int intermediate = n;
            int result = 0;
           
        
            while(intermediate != 0){
               
                result = result + (intermediate%10) * (intermediate%10);
                intermediate = intermediate /10;
                
            }
            
            if(exists.contains(result)){
                return false;
            }
            
            exists.add(result);
            n = result;
        }
        
       return true; 
    }
}

//HashSet - this is used to store numbers that are different from each other(unique) and doesn't allow to add duplicate numbers.
//created a hashset so that whenever we try to add a number that already exists we check if they exist if so we return false
//if it doesn't exist we add it to the set
//in the while loop there are two variables , result - to store the result , intermediate - to move backwards to the number before.