package ch8;

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    public UnsupportedFunctionException(String message, int errorCode) {
        super(message);
        ERR_CODE = errorCode;
    }

    public UnsupportedFunctionException(String message) {
        this(message, 100);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}

public class ex9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}
