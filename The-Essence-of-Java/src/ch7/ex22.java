package ch7;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this(new Point(0, 0), r);
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    public Rectangle(Point p, double width, double height) {
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
