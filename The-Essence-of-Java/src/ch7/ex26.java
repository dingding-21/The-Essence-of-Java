package ch7;

class Outer1 {
    static class Inner {
        int iv = 200;
    }
}

class ex26 {
    public static void main(String[] args) {
        Outer1.Inner inner = new Outer1.Inner();
        System.out.println(inner.iv);
    }
}

