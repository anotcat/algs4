package part_1;

public class InvertArray {
    public static void main(String[] args) {
//        int[] samples = new int[10];
        int[] samples = {12, 13, 14, 15, 18};
        int len = samples.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = samples[i];
            samples[i] = samples[(len - 1) - i];
            samples[(len - i) - 1] = temp;
        }
        for (int i : samples) {
            System.out.println(i);
        }
    }
}
