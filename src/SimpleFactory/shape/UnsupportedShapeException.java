package SimpleFactory.shape;

//自定义异常
public class UnsupportedShapeException extends Exception{
    public UnsupportedShapeException(String message) {
        super(message);
    }
}
