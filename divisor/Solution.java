package divisor;

class Solution {
    public static int[] solution(int[] arr, int divisor) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                System.out.println(arr[i]);
                index++;

            }
        }
        int[] answer = new int[index];
        index = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % divisor == 0) {
                answer[index] = arr[j];
                index++;
            }

            int temp = 0;
            for (int z = 0; z < answer.length - 1; z++) {
                for (int i = 0; i < answer.length - 1; i++) {
                    if (answer[i] > answer[i] + 1) {
                        temp = answer[i];
                        answer[i] = answer[i + 1];
                        answer[i + 1] = temp;
                    }
                }

            }

        }
        if (index == 0) {
            int[] answer1 = new int[1];
            answer1[0] = -1;
            return answer1;
        }

        return answer;

    }
}