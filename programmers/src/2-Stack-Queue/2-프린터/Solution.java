import java.util.*;

class Print{
    int location;
    int priority;
    public Print(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }
}

class Solution{
    public int solution(int[] priorities, int location) {
        // 블로그참조
        int answer = 0;
        int now = 0;
        Queue<Print> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Print(i, priorities[i]));
        }


        while (!queue.isEmpty()) {
            Print p1 = queue.poll();
            boolean flag = false;

            for (Print p2 : queue) {
                if(p2.priority > p1.priority) {
                    flag = true;
                }
            }
            
            if(flag){
                queue.add(p1);
            }
            else {
                now++;
                if (p1.location == location) {
                    answer = now;
                    break;
                }
            }

        }
        return answer;
    }
}