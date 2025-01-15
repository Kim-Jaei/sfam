import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        //어디서 많이 본 문제.. 아마 {} 이거 제거하는 문제였던거 같다
        //이건 스택으로 풀자!

        Stack<Character> stack = new Stack<>();

        //문자열을 하나씩 확인하면서 스택에 넣어야 한다.
        //toCharArray => 문자열을 char형 배열로 바꿔준다!
        for(char a : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==a){
                stack.pop();
            }else{
                stack.push(a);
            }
        }

        //스택이 모두 비면 성공적 수행 -> 1 / 실패하면 0
        answer = stack.isEmpty() ? 1:0;


        return answer;
    }
}