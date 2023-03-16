
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int N, int number) {
        Set<Integer> count = new HashSet<>();
        Set<Integer> count2 = new HashSet<>();
        int cnt = 1;

        count.add(N);
        count2.add(N);

        for(int i=2; i<9; i++) {
            for(int a : count) {
                if(number == a) {
                    return cnt;
                }

                count2.add(plus(a, N));
                count2.add(minus(a, N));
                count2.add(minus(N, a));
                count2.add(multiplication(a, N));
                count2.add(division(a, N));
                count2.add(a * 10 + N);
            }

            for(int a2 : count2) {
                count.add(a2);
            }
            cnt ++;
        }

        return -1;
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        if(a != 0 && b!= 0)
            return a / b;
        return a;
    }

}
