package SimpleFactory.shape.imp;


import SimpleFactory.shape.Shape;

//矩形
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制出矩形");
    }

    @Override
    public void erase() {
        System.out.println("擦除矩形");
    }
}
