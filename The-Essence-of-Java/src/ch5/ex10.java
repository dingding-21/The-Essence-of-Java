package ch5;

public class ex10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};

        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        StringBuilder result = new StringBuilder();

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                result.append(abcCode[ch - 'a']);
            }

            if ('0' <= ch && ch <= '9') {
                result.append(numCode[ch - '0']);
            }

            // error 발생
        }

        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}
