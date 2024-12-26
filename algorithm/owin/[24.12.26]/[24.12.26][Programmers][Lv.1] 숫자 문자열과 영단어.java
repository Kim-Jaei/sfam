/*
    1. 영단어 저장해 놓고 일치하는 친구 변환시키기
    2. 숫자면 그대로 answer에 누적시키고 아니면 위에 대로 변환
*/
class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = "";
        String makeWord = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) { // 현재 char가 숫자인지 확인
                answer += currentChar; // 숫자면 바로 answer에 추가
            }
            else {
                makeWord += currentChar; // 누적해서 단어 만들기

                // 단어가 있는지 찾기
                for (int j = 0; j < words.length; j++) {
                    if (makeWord.equals(words[j])) {
                        answer += j;  // 배열의 인덱스가 숫자랑 같으니 바로 추가
                        makeWord = "";  // makeWord 초기화
                        break; // 찾았으니 뒤에 더 보지 않고 종료
                    }
                }
            }
        }
        return Integer.parseInt(answer);
    }
}