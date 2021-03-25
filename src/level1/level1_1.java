package level1;

import java.util.Arrays;
import java.util.HashSet;

//두 개 뽑아서 더하기
public class level1_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] numberArr = {12,31,2,5,10};
        sol.solution(numberArr);


    }
}
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(j==i){
                    continue;
                }
                set.add(numbers[j]+numbers[i]);
            }
        }

        int count=0;
        int [] ret = new int[set.size()];
        for(Integer val : set){
            ret[count++]=val;
        }
        Arrays.sort(ret);
        return ret;

    }
}
