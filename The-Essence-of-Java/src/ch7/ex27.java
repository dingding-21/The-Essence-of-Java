package ch7;

class Outer3 {
    int value = 10;

    class Inner3 {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value);
        }
    }
}

class ex27 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Outer3.Inner3 inner3 = outer3.new Inner3();

        inner3.method1();
    }
}