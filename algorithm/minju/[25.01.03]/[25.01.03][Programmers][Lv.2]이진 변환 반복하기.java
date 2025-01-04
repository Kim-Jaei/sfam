class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        
        
        while(s.length()>1){
            //1개수 카운트
             int uno = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='0'){
                    answer[1]++;
                }else{
                    uno++;
                }
            }
            
            s= Integer.toBinaryString(uno);
            answer[0]++;
        }
        
        
        
        return answer;
    }
}