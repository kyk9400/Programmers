package level1;

import java.util.Arrays;

//완주하지 못한 선수
//효율성 똥망
public class level1_2 {
    public static void main(String[] args) {
        String [] participant={"leo", "kiki", "eden"};
        String [] completion={"eden", "kiki"};
        Solution sol = new Solution();
        sol.solution(participant,completion);
    }
    static class Solution {
        public  String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            String temp="";
            for(int i=0;i<completion.length;i++){
                if(!participant[i].contentEquals(completion[i])){
                    temp=participant[i];
                    break;
                }
            }
            if(temp.contentEquals("")){
                for(int i=0;i<completion.length;i++){
                    if(participant[participant.length-1].contentEquals(completion[i])){
                        return temp;
                    }else{
                        return participant[participant.length-1];
                    }
                }
            }
            return temp;
        }
    }

}
