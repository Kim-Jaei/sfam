/*
    1. 기사 번호의 약수 개수에 해당하는 공격력 -> ex) 12 1,2,3,4,6,12 = 공격력 6
    1, 2, 3, 4, 5
    1 = 1            1
    2 = 1, 2         2
    3 = 1, 3         2
    4 = 1, 2, 4      3
    5 = 1, 5         2
    6 1236
*/
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[number+1]; // 1부터 체크해야하기 때문에 +1

        for (int i = 1; i <= number; i++) { // 1부터 number까지
            for (int j = i; j <= number; j += i) { // 본인을 배수 처리해서 count 배열의 각 자리에 몇개의 약수가 있는지 설정
                count[j]++;
            }
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] > limit) { // 한계치를 넘어가면 공격력을 고정
                count[i] = power;
            }
            answer+=count[i];
        }
        return answer;
    }
}