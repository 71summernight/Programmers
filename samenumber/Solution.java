package samenumber;

public class Solution {
    public static int[] solution(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                index++;
            }
        }
        int count = arr.length - index;
        int[] answer = new int[count];

        for(int i=0; i<answer.length; i++) {
        }


        answer[0] = arr[0];
        int point=1;
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] != arr[j+1]) {
                answer[point] = arr[j+1];
                point++;
            }
        }
        return answer;

    }
}
