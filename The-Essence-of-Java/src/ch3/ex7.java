package ch3;

public class ex7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celsius = (int) (5 / 9f * (fahrenheit - 32) * 100 + 0.5) / 100f;

        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celsius:" + celsius);
    }
}
