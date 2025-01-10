class Solution {
    public long solution(int n) {
        if (n <= 0) return 0; // 예외 처리
        //n=8까지 해본 결과, 피보나치 수열 규칙성이 있었다..!
        // 배열의 크기를 n+1로 설정하여 list[n]까지 접근 가능
        int[] list = new int[n + 1];

        // 초기 값 설정
        if (n >= 1) list[1] = 1;
        if (n >= 2) list[2] = 2;
        if (n >= 3) list[3] = 3;

        //
        for (int i = 4; i <= n; i++) {
            list[i] = (list[i - 1] + list[i - 2]) % 1234567; // 모듈러 연산 포함
        }

        return list[n];
    }
}
