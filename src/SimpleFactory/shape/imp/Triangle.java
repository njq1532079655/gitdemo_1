package SimpleFactory.shape.imp;


import SimpleFactory.shape.Shape;

//三角形
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制出三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
