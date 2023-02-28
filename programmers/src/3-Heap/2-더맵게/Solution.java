import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> heap = new LinkedList<>();

        Arrays.sort(scoville);
        
        for (int scov : scoville) {
            heap.offer(scov);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();



            heap.offer(a + (b * 2));
            answer ++;
        }

        return answer;
    }
}