import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    private Set<Integer> nums = new LinkedHashSet<>();

    public int solution(String numbers) {
        recursive("", numbers);


        return (int) nums.stream()
                .filter(i -> checkInt(i))
                .count();
    }

    private boolean checkInt(int a) {
        if(a== 0 || a == 1) {
            return false;
        }

        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void recursive(String comb, String others) {
        if (!comb.equals(""))
            nums.add(Integer.parseInt(comb));

        for (int i = 0; i < others.length(); i++){
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
}