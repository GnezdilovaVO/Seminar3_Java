import java.util.ArrayList;

public class program3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        fillArray(list, 5);
        System.out.println(list);
        int max = getMax(list);
        int min = getMin(list);
        double medium = getAverge(list);
        System.out.println("Максимальное: " + max + " Минимальное: " + min + " Среднее: " + medium);
    }

    public static void fillArray(ArrayList<Integer> data, int count) {
        for (int i = 0; i < count; i++) {
            data.add((int) (Math.random() * 100));
        }
    }

    public static int getMax(ArrayList<Integer> data) {
        int maxNumb = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > maxNumb) {
                maxNumb = data.get(i);
            }
        }
        return maxNumb;
    }

    public static int getMin(ArrayList<Integer> data) {
        int minNumb = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < minNumb) {
                minNumb = data.get(i);
            }
        }
        return minNumb;
    }
    public static double getAverge(ArrayList<Integer> data) {
        double count = data.size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += data.get(i);
        }
        double average = sum / count;
        return average;
    }
}
