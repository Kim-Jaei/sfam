class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;  // 받은 전체 콜라의 수
        int current = n;  // 현재 가지고 있는 병의 수
        
        while (current >= a) {  // 보유 병이 교환 가능한 수보다 많을 때
            int exchange = (current / a) * b;  // 이번에 받을 콜라의 수
            int remaining = current % a;  // 교환하고 남은 병의 수
            
            totalCola += exchange;  // 받은 콜라를 전체 수에 더함
            current = exchange + remaining;  // 현재 보유한 병 업데이트
        }
        
        return totalCola;
    }
}
