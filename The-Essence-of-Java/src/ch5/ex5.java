package ch5;

public class ex5 {
    public static void main(String[] args) {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length); // 0 ~ 8
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        /*
            for (int i = 0; i < 3; i++) {
                ball3[i] = ballArr[i];
            }
         */
        System.arraycopy(ballArr, 0, ball3, 0, 3);


        for (int ball : ball3) {
            System.out.print(ball);
        }
    }
}
