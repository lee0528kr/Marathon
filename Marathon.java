import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer= "";
        // 김 박 이  | 이 김             김 박 이  김 이 ----- '박' 이 완주 x 
        // 김 박 이  | 박 김             김 박 이  김 박 ----- '이 ' 가 완주 x
        // 김 박 이  | 이 박             김 박 이  박 이 ----- '김' 이 완주 x
        int i;
        for(i=0; i<completion.length; i++)
        {
            if(!participant[i].equals(completion[i])) // 정렬을 하고 비교하였는데 둘이 다르면
            {
                answer = participant[i]; // 그 사람이 정답
                return answer;
             
            }
        }
        answer = participant[i]; // 다 조사해도 같으면 맨 끝 선수가 완주x
        return answer;
     
    }

    public static void main(String[] args) {

        Solution sol= new Solution();

        String[] n = { "leo", "kiki", "eden" };
        String[] n1 = { "eden", "kiki" };
        String name = sol.solution(n, n1);

        String[] a = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] a1 = { "josipa", "filipa", "marina", "nikola" };
        String name1 = sol.solution(a, a1);

        String[] s = { "mislav", "stanko", "mislav", "ana" };
        String[] s1 = { "stanko", "ana", "mislav" };
        String name2 = sol.solution(s, s1);

        
      

    }
}