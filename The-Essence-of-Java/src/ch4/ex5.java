package ch4;

public class ex5 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i += 1;
        }
    }
}