package SimpleFactory.shape;
import SimpleFactory.shape.imp.Circle;
import SimpleFactory.shape.imp.Rectangle;
import SimpleFactory.shape.imp.Triangle;

//形状工厂
public class ShapeFactory {
    public static Shape getShape(String type) throws UnsupportedShapeException{
        Shape shape;
        if (type.equalsIgnoreCase("圆形")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("矩形")) {
            shape  = new Rectangle();
        } else if (type.equalsIgnoreCase("三角形")) {
            shape = new Triangle();
        } else{
            throw new UnsupportedShapeException(type+"不能绘制");
        }
        return shape;
    }
}
