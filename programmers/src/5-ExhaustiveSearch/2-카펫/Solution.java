class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow;

        int yellowLength = searchArea(area, yellow);
        int yellowWidth = yellow / yellowLength;

        answer[0] = yellowWidth +2;
        answer[1] = yellowLength +2;

        return answer;
    }

    private int searchArea(int area, int yellow) {
        for(int i=1; i<= yellow; i++) {
            if(yellow % i == 0) {
                if((i+2) * (yellow/i+2) == area) {
                    return i;
                }
            }
        }

        return 1; // 의미없음
    }
}