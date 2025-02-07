import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 유저별로 받을 메일 수
        int[] answer = new int[id_list.length];
    
        // report 배열을 List로 변환 -> List를 HashSet으로 변환하여 중복 제거
        // ex) "muzi frodo"가 여러번 있어도 한 번만 저장
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        // 각 유저별 신고한 사람 목록
        // key: 신고당한 사람, value: 신고한 사람
        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        
        // 각 유저별 신고당한 횟수
        // key: 유저 아이디 value: 신고당한 횟수
        HashMap<String, Integer> reportedCountMap = new HashMap<>();
        
        // HashMap 초기화
        for(String id : id_list) {
            reporterMap.put(id, new HashSet<>());
            reportedCountMap.put(id, 0);
        }
        
        for(String r : reportSet) {
            String[] data = r.split(" "); // 공백 기준으로 문자열 나누기
            String reporter = data[0];  // 신고한 사람
            String reported = data[1];  // 신고당한 사람
            
            // reporterMap에서 신고당한 사람의 set에 신고한 사람 추가
            reporterMap.get(reported).add(reporter);
            
            // reportedCountMap에서 신고당한 사람의 신고 횟수 1 증가
            reportedCountMap.put(reported, reportedCountMap.get(reported) + 1);
        }
        
        // 메일 발송
        for(int i = 0; i < id_list.length; i++) {
            int count = 0;
            String userId = id_list[i]; // 현재 확인할 유저 아이디
            
            // 각 유저별로 자신이 신고한 사람들 중 정지된 사람 수 확인
            for(String reported : id_list) {
                if(reportedCountMap.get(reported) >= k && // k번 이상 신고됐는지
                   reporterMap.get(reported).contains(userId)) { // 이 유저가 신고했는지
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}
