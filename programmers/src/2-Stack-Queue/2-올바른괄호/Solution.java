import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> box = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                box.push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                if(box.size() == 0){
                    return false;
                }
                box.pop();
            }
        }

        if(box.size() != 0) {
            return false;
        }

        return true;
    }
}