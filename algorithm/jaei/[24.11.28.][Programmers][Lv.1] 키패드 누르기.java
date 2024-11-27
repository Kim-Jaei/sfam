class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        // 키패드 좌표 정의
        int[] leftPos = {3, 0};  // '*'의 초기 위치
        int[] rightPos = {3, 2}; // '#'의 초기 위치
        int[][] keypad = {
            {3, 1}, // 0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}  // 9
        };

        for (int num : numbers) {
            // 왼손으로 누름
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftPos = keypad[num]; // 왼손 위치 업데이트
            } 
            // 오른손으로 누름
            else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightPos = keypad[num]; // 오른손 위치 업데이트
            } else {
                // 현재 키패드 좌표
                int[] targetPos = keypad[num];
                
                // 왼손과 현재 숫자 사이의 거리
                int leftDistance = getDistance(leftPos, targetPos);
                
                // 오른손과 현재 숫자 사이의 거리
                int rightDistance = getDistance(rightPos, targetPos);
                
                // 거리가 더 짧은 손 사용
                if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftPos = targetPos;
                } else if (rightDistance < leftDistance) {
                    answer.append("R");
                    rightPos = targetPos;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftPos = targetPos; // 왼손 위치 업데이트
                    } else {
                        answer.append("R");
                        rightPos = targetPos; // 오른손 위치 업데이트
                    }
                }
            }
        }

        return answer.toString();
    }

    // 두 좌표 간의 거리 계산 (맨해튼 거리 공식)
    private int getDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}



// * StringBuilder를 사용하는 이유
//   1. 반복적으로 "L" 또는 "R"을 문자열에[ 추가하기 때문에 append를 호출해 효율적으로 추가 가능
//   2. numbers의 배열 길이가 최대 1000이므로 메모리 효율을 위해

// * 맨해튼 거리 공식
//   두 점이 2D 평면 위에 있을 때, 수직 및 수평으로만 이동할 수 있는 경우 최단 거리
//   대각선 이동은 고려하지 않
//   (x1, y1)과 (x2, y2) 사이의 맨해튼 거리 = |x1 - x2| + |y1 - y2| = 두 점 사이의 x축 차이의 절댓값 + y축 사이의 절댓값

// * 유클리드 거리 vs 맨해튼 거리
//   유클리드 : 두 점 사이의 직선 거리
//   맨해튼 : 직교 거리, 수직/수평만 이동만 고려
