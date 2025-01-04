import java.time.*;
class Solution {
    public String solution(int a, int b) {
        int answer = 0;
        //1. (a월의 날짜수 + b일) % 7 
        //요일 배열 -> 1월 1일이 금요일부터 시작
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        //각 월 일수 배열
        int[] dayCount = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        
        //a월 b일 이전의 총 일수 더하기
        for(int i = 0; i < a-1; i++){
            answer += dayCount[i];
        }
        
        answer += b-1;
        
        return day[answer%7];
        
        
        //2. LocalDate 사용하기
        // return LocalDate.of(2016, a,b).getDayOfWeek().toString().substring(0,3);
    }
}