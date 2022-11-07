package SimpleFactory.shape;

//客户端
public class Client {
    public static void main(String[] args) throws Exception{
        Shape shape;
        shape = ShapeFactory.getShape("三角形");
        shape.draw();
        shape.erase();
    }
}
