import java.util.TreeMap;

public class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (String str : operations) {
            int n = Integer.parseInt(str.substring(2));

            if(str.charAt(0) == ('I')) {
                tm.put(n, n);
                continue;
            }

            if(str.charAt(0) == 'D') {
                if(tm.isEmpty()) {
                    continue;
                }

                if (n == 1) {
                    tm.remove(tm.lastKey());
                }
                if (n == -1) {
                    tm.remove(tm.firstKey());
                }
            }
        }

        if (tm.size() >= 1) {
            answer[0] = tm.lastKey();
            answer[1] = tm.firstKey();
        }

        return answer;
    }
}