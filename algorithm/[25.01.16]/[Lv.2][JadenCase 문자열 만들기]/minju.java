class Solution {
    public String solution(String s) {


        //스트링 배열을 만든 뒤 ""을 기준으로 s를 나눈다!
        //모든 배열의 모든 아이들을 해당 조건을 씌워서 JadenCase로 바꾼다
        //String builder로 다시 합치기!

        //1. 공백 기준 문자열 나누기
        String[] list = s.split(" ",-1); //공백 포함 배열 생성

        //2. 조건
        for(int i = 0 ; i<list.length; i++){
            if(list[i].length()>0){
                char first = list[i].charAt(0);

                //만약 첫번째 글자가 알파벳이라면, 첫글자만 대문자로 바꾸고 나머진 유지
                if(Character.isLetter(first)){

                    list[i] = Character.toUpperCase(first) + list[i].substring(1);


                } else {
                    list[i]=list[i];
                }

                //추가

                //첫문자가 아닌데 대문자라면 소문자로 바꿔주기
                //첫문자는 바꿔줬으니 1부터 시작!

                StringBuilder sb = new StringBuilder();
                sb.append(list[i].charAt(0));

                for(int j = 1; j<list[i].length(); j++){
                    char current = list[i].charAt(j);
                    if(Character.isUpperCase(current)){
                        sb.append(Character.toLowerCase(current));
                    } else {
                        sb.append(current);
                    }
                }
                list[i] = sb.toString();
            }
        }

        String answer = String.join(" ", list);

        return answer;
    }
}