/*
    1. targets를 문자열 하나씩보면서 keymap 탐색이 필요
    2. keymap을 탐색하려면 targets[1]의 첫번째 문자열을 가지고 keymap을 돌면서 가장 작은 키의 경우의 수를 keydown에 누적
    3. keydown을 answer배열에 추가하고 리턴
*/

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++) {
            int keydown = 0;

            for(int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                int minKey = Integer.MAX_VALUE; // 최소키 구하기

                for (String key : keymap) {
                    int keyIndex = key.indexOf(target); // target이랑 같은 인덱스가 있는 첫 위치 기억
                    if (keyIndex != -1) {
                        minKey = Math.min(minKey, keyIndex + 1); // index는 0부터 시작하므로 +1
                    }
                }
                if (minKey == Integer.MAX_VALUE) {
                    keydown = -1;  // 문자를 찾을 수 없는 경우
                    break;
                } else {
                    keydown += minKey;
                }
            }
            answer[i] = keydown;
        }
        return answer;
    }
}