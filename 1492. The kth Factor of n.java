class Solution {
    public int kthFactor(int n, int k) {
        int mod =0;
        if(n<k){
            return -1;
        }
        
        
        ArrayList<Integer> list= new ArrayList<>();
        for(int i =1; i<=n;i++){
           
            if(n%i == 0){
                System.out.println(i);
                list.add(i);
            }
        }
        
        if(list.size() < k){
            return -1;
        }
        return list.get(k-1);
    }
}