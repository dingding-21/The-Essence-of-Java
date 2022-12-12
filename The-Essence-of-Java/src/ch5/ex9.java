package ch5;

public class ex9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        char[][] result = new char[star[0].length][star.length];

        for (char[] starLine : star) {
            for (char s : starLine) {
                System.out.print(s);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][star.length - 1 - i] = star[i][j];
            }
        }

        for (char[] resultLine : result) {
            for (char res : resultLine) {
                System.out.print(res);
            }

            System.out.println();
        }
    }
}
