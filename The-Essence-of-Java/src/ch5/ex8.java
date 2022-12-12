package ch5;

public class ex8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int num : answer) {
            counter[num - 1]++;
        }

        for (int cnt : counter) {
            System.out.print(cnt);

            for (int j = 0; j < cnt; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
