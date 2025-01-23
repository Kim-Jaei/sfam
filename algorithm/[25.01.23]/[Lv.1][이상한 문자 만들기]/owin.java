class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ss = s.toCharArray();
        int index = 0;

        for(int i = 0; i < ss.length; i++) {
            if(ss[i] == ' ') {
                answer += ss[i];
                index = 0;
            }
            if(ss[i] != ' ' && index % 2 == 0) {
                answer += Character.toUpperCase(ss[i]);
                index++;
            } else if(ss[i] != ' ' && index % 2 == 1) {
                answer += Character.toLowerCase(ss[i]);
                index++;
            }
        }
        return answer;
    }
}