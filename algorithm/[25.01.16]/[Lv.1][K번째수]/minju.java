import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        //일단 for문 돌려서 array 자르기
        for(int i =0 ; i<commands.length; i++){
            //commands의 값들 뽑아서 저장
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2]-1;

            List<Integer>list = new ArrayList<>();


            //list에 저장
            for(int j=a-1; j<b; j++){
                int d = array[j];
                list.add(d);
            }

            //정렬
            Collections.sort(list);

            //answer에 값 넣어주기
            answer[i]=list.get(c);
        }

        System.out.print(answer);

        return answer;
    }
}