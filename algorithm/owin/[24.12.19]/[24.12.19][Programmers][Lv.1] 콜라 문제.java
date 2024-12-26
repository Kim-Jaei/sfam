/*
    1. 재귀로 풀어야될듯
    2. 공식 한번 돌리고 나올때마다 콜라를 받는 개수를 sum에 더해주자
*/
class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int answer = jaegui(a, b, n, sum);
        return answer;
    }
    
    // 재귀함수
    public int jaegui(int a, int b, int n, int sum) {
        // 더 병을 못바꾸면 스탑!
        if (n < a) {
            return sum;
        }
    
        int bottle = (n / a) * b; // 받은 병
        sum += bottle; // 받은 병 개수 누적 합산
        n = (n % a) + bottle; // 바꾸고 남은 병 개수와 받은 병 개수를 더해서 업데이트 
        return jaegui(a, b, n, sum);
    }
}