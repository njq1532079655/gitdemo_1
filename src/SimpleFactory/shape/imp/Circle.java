package SimpleFactory.shape.imp;

import SimpleFactory.shape.Shape;

//圆形
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制出圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
