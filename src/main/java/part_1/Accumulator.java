package part_1;

public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + "values ):" + String.format("%7.5f", mean());// 7.5f 将mean结果转为保留7位小数的浮点数
    }

}
