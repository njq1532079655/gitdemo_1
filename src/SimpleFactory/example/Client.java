package SimpleFactory.example;

import SimpleFactory.example.util.XMLUtil;

//客户端
public class Client {
    public static void main(String[] args) {
//方法一
//        Chart chart;
//        chart= ChartFactory.getChart("line");
//        chart.display();
//方法二
        Chart chart;
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();

    }
}
