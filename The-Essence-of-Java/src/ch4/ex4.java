package ch4;

public class ex4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        int index = 1;

        while (sum < 100) {
            num = index;

            if (index % 2 == 0) {
                num *= -1;
            }
            sum += num;
            index += 1;
        }

        System.out.println(num);
    }
}
