package ch7;

abstract class Shape1 {
    Point1 p;

    Shape1() {
        this(new Point1(0, 0));
    }

    Shape1(Point1 p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point1 getPosition() {
        return p;
    }

    void setPosition(Point1 p) {
        this.p = p;
    }
}

class Point1 {
    int x;
    int y;

    Point1() {
        this(0, 0);
    }

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle1 extends Shape1 {
    double r;

    public Circle1(double r) {
        this(new Point1(0, 0), r);
    }

    public Circle1(Point1 p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle1 extends Shape1 {
    double width;
    double height;

    public Rectangle1(double width, double height) {
        this(new Point1(0, 0), width, height);
    }

    public Rectangle1(Point1 p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    // 정사각형인지 아닌지 알려주는 함수
    boolean isSquare() {
        return width * height != 0 && width == height;
    }
}

class ex23 {
    public static double sumArea(Shape1[] arr) {
        double sum = 0;

        for (Shape1 sh : arr) {
            sum += sh.calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape1[] arr = {new Circle1(5.0), new Rectangle1(3, 4), new Circle1(1)};
        System.out.println("면적의 합: " + sumArea(arr));
    }
}
