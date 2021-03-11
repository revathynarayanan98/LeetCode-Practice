class Solution {
    public void reverseString(char[] s) {
//        char temp = '0';
//         // System.out.println(temp);
//         // System.out.println(j);
//         for(int i =0; i<s.length -1; i++){
//            for(int j = s.length - 1; j <= 0; j--){
//               temp = s[i];
//                s[j] = temp;
               
//            } 
//         }
//         System.out.println("" + new String(s));
//         return 0;
        
        int left = 0;
        int right = s.length - 1;
        char temp = '0';
        while(left<right){
            
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
            
        }
    }
}