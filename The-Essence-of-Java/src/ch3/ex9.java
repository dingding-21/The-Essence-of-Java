package ch3;

public class ex9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));

        System.out.println(b);
    }
}
