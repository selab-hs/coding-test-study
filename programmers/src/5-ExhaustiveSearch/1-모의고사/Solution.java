import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        List<Integer> answer = new ArrayList<>();
        int[] result = new int[3];

        for(int i = 0; i< answers.length; i++) {
            int count = 0;
            for(int[] pattern : patterns) {
                if(pattern[i % pattern.length] == answers[i]) {
                    result[count] ++;
                }
                count ++;
            }
        }

        int max = Math.max(Math.max(result[0], result[1]), result[2]);

        for(int i=0; i < result.length; i++) {
            if(max == result[i]) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                .mapToInt(i -> i.intValue())
                .toArray();
    }
}