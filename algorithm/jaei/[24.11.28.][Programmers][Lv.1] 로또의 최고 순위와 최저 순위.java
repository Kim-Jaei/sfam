class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++; // 0의 개수 카운트
            } else {
                for (int winNum : win_nums) {
                    if (lotto == winNum) {
                        matchCount++;
                        break; // 중복 방지를 위해
                    }
                }
            }
        }

        // 최고 순위
        int maxRank = (matchCount + zeroCount == 6) ? 1 :
                      (matchCount + zeroCount == 5) ? 2 :
                      (matchCount + zeroCount == 4) ? 3 :
                      (matchCount + zeroCount == 3) ? 4 :
                      (matchCount + zeroCount == 2) ? 5 : 6;

        // 최저 순위
        int minRank = (matchCount == 6) ? 1 :
                      (matchCount == 5) ? 2 :
                      (matchCount == 4) ? 3 :
                      (matchCount == 3) ? 4 :
                      (matchCount == 2) ? 5 : 6;

        return new int[]{maxRank, minRank};
    }
}
