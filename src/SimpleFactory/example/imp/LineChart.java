package SimpleFactory.example.imp;


import SimpleFactory.example.Chart;

public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示折线图！");
    }

    public LineChart() {
        System.out.println("创建折线图！");
    }
}
