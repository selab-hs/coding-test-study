import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> dateBox = new ArrayList<>();
        List<Integer> resultBox = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            dateBox.add(addValidation(progresses[i], speeds[i]));
        }

        for(int i=0; i < dateBox.size(); i++) {
            if (!q.isEmpty() && q.peek() < dateBox.get(i)) {
                resultBox.add(q.size());
                q.clear();
            }

            q.offer(dateBox.get(i));
        }

        resultBox.add(q.size());

        return resultBox.stream().mapToInt(value -> value).toArray();
    }

    private int addValidation(int progress, int speed){
        double remain = (100 - progress) / (double) speed;
        return (int) Math.ceil(remain);
    }
}