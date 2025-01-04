class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder half = new StringBuilder();
        
        //물이 0번이니깐, 음식은 1번부터임
        for(int i =1; i<food.length; i++){
            int cnt = food[i]/2;
            for(int j=0; j<cnt; j++){
                half.append(i);
            }
        }
        
        String rotation = half.reverse().toString();
        
        
        
        return half.reverse().toString()+"0"+rotation;
    }
}