import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int hIndex;

        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++) {
            hIndex = citations.length - i;

            if(citations[i] >= hIndex) {
                answer = hIndex;
                break;
            }
        }

        return answer;
    }
}