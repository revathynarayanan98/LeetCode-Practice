class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(count.containsKey(c)){
                count.put(c, count.get(c)+1);
            }
            
            else{
                count.put(c,1);
            }
        }
        
        for(int i = 0; i<s.length();i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
      return -1;
    }
}


//hashmaps are lists of keys and values
//has inbuilt methods such as put to put keys and its values, get to get/retrieve keys and values, containsKey boolean method which returns if a key/value exists or not,
//containsValues, replace to replace keys/values, remove
//STEPS
//Created a hashmap 
//then iterated through the string and put it in the hashmap- whenever it contains the char it increases the value by 1 and when not it puts the value as 1
//made another for loop to output the index of first key whose value == 1