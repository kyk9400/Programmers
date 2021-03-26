package level1;

//신규 아이디 추천
public class level1_3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("z-+.^.");
    }

    static class Solution{
        public String solution(String new_id) {
            String answer = new_id.toLowerCase();
            answer = answer.replaceAll("[^-_.a-z0-9]","");
            answer = answer.replaceAll("[.]{2,}",".");
            answer = answer.replaceAll("^[.]|[.]$","");

            if(answer.length()==0){
                answer=answer+"a";
            }

            if(answer.length()>15){
                answer=answer.substring(0,15).replaceAll("[.]$","");
            }

            if(answer.length()<3){
                char a = answer.charAt(answer.length()-1);
                while(answer.length()<3){
                    answer = answer+a;
                }
            }
            return answer;
        }
    }
}
