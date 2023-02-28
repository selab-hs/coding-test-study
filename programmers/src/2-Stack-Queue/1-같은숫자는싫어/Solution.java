import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
    List<Integer> stack = new ArrayList<>();

    for(int i=1; i<arr.length; i++) {
        if(!(arr[i-1] == arr[i])) {
            stack.add(arr[i - 1]);
        }
    }
    
    stack.add(arr[arr.length-1]);

    return stack.stream().mapToInt(value -> value).toArray();
    }
}