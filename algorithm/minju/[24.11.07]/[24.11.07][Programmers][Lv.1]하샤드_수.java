class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        
        //x는 1이상 10000이하 -> 루프로 마지막 자리 숫자를 빼서 sum에 더하자!
        while(a != 0){
            sum += a %10;  //x의 마지막 숫자를 sum에다 더하기
            a = a/10;  //다음 루프를 위해 a를 갱신
        }
        //하샤드 수 정의 검사
        return x%sum ==0 ? true:false; 
    }
}