//1. 모든 조건 전부 쓰기
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int len = order.length;
        
        for(int i =0 ; i <len ; i ++){
		        //아메리카노의 모든 경우의 수를 조건으로 건다!
            if(order[i].equals("iceamericano")||order[i].equals("americanoice")||order[i].equals("hotamericano")||order[i].equals("americanohot")||order[i].equals("americano")||order[i].equals("anything"))
            {
                answer += 4500;
            } else{
                answer+=5000;
            }
        }
        
        
        return answer;
    }
}

//2. 아메리카노를 포함하는 경우 + 아무거나 조건 걸기
//문자열에서 contains랑 equals를 통해 포함이나 일치하는 관계를 찾아낼 수 있음~!
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int len = order.length;
        
        for(int i =0 ; i <len ; i ++){
            if(order[i].contains("americano")||order[i].equals("anything"))

            {
                answer += 4500;
            } else{
                answer+=5000;
            }
        }
        
        
        return answer;
    }
}

