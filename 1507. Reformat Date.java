class Solution {
    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        
        String[] items = new String[2];
        StringBuilder build = new StringBuilder();
        
        items = date.split(" ");
        
        int i=2;
        while(i>=0){
            
            if(i == 2){
                build.append(items[i]+"-");
            }
            else if(i == 1){
                build.append(map.get(items[i])+"-");
            }
            else if (i == 0){
                int j=0;
                while(Character.isDigit(items[i].charAt(j))){
                    j++;
                }
                if(j == 1){
                    build.append("0"+items[i].substring(0,j));
                }
                else if (j == 2){
                    build.append(items[i].substring(0,j));
                }
            }
            
            i--;
        }
        
        return build.toString();

    }
}