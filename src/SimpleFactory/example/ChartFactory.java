package SimpleFactory.example;

import SimpleFactory.example.imp.HistogramChart;
import SimpleFactory.example.imp.LineChart;
import SimpleFactory.example.imp.PieChart;

public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼图");
        } else if (type.equalsIgnoreCase("Histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
