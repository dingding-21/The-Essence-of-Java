package ch7;

class SutdaCard3 {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard3() {
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang) {
        this.NUM = num; // 생성자에서 단 한 번의 초기화만 가능
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}

class ex14 {
    public static void main(String[] args) {
        SutdaCard3 card = new SutdaCard3(1, true);
    }
}

