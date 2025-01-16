import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }
        answer = String.join(" ", words);
        return answer;
    }
}