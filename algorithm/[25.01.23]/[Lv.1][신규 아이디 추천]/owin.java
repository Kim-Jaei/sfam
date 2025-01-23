import java.util.*;

class Solution {
    public String solution(String new_id) {
        List<Character> temp = new ArrayList<>(); // 임시 저장 장소

        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        for(char c : new_id.toCharArray()) {
            if(c == '-' || c == '_' || c == '.' || Character.isDigit(c) || Character.isAlphabetic(c)) {
                temp.add(c);
            }
        }

        // 3단계
        for (int i = temp.size() - 2; i >= 0; i--) {
            if (temp.get(i) == '.' && temp.get(i + 1) == '.') {
                temp.remove(i);
            }
        }

        // 4단계
        if (!temp.isEmpty() && temp.get(temp.size()-1) == '.') {
            temp.remove(temp.size()-1);
        }
        if (!temp.isEmpty() && temp.get(0) == '.') {
            temp.remove(0);
        }

        // 5단계
        if(temp.isEmpty()) {
            temp.add('a');
        }

        // 6단계
        if(temp.size() > 15) {
            while(temp.size() > 15) {
                temp.remove(15);
            }
            if(temp.get(temp.size() - 1) == '.') {
                temp.remove(temp.size() - 1);
            }
        }

        // 7단계
        if(temp.size() == 1) {
            char one = temp.get(0);
            temp.add(one);
            temp.add(one);
        } else if(temp.size() == 2) {
            char two = temp.get(1);
            temp.add(two);
        }

        // 문자열로 바꾸기
        char[] charArray = new char[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            charArray[i] = temp.get(i);
        }

        return new String(charArray);
    }
}