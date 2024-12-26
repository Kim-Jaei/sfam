/*
    1. 이중for문 가능할까 10,000이라 가능할거 같음
*/
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}