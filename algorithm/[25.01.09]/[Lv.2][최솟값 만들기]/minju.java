import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
    
        //배열 하나는 오름차순, 하나는 내림차순으로 정렬후에 같은 위치끼리 곱하면 되겠다~
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        //배열 B를 오름차순 정렬한 후에 내림차순으로 배열 뒤집음
        for(int i = 0 ; i < B.length/2 ; i++){
            int temp = B[i];
            B[i]=B[B.length-1-i];
            B[B.length-i-1]=temp;
        }
            
        
        for(int i = 0; i<A.length ; i++){
            int multiple = A[i]*B[i];
            answer+=multiple;
        }

        
        return answer;
    }
    
    
    
}