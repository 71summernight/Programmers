package k;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        int[] answer = new int[commands.length];
        for (int g = 0; g <commands.length; g++) {
            i = commands[g][0];
            j = commands[g][1];
            k = commands[g][2];
            int[] arrresult = new int[j - i + 1];

            int index = 0;
            for (int z = i; z <= j; z++) {
                arrresult[index] = array[z - 1];
                index++;
            }
            int temp = 0;

            for (int z = 0; z < arrresult.length - 1; z++) {
                for (int y = 0; y < arrresult.length - 1; y++) {
                    if (arrresult[y] > arrresult[y + 1]) {
                        temp = arrresult[y];
                        arrresult[y] = arrresult[y + 1];
                        arrresult[y + 1] = temp;

                    }

                }

            }

            answer[count] = arrresult[k - 1];
            count++;
        }

        return answer;
    }
}
