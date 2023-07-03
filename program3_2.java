import java.util.ArrayList;

public class program3_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        fillArray(list, 10);
        System.out.println(list);
        deleteEven(list);
        System.out.println(list);
        
    }
    public static void fillArray (ArrayList<Integer> data, int count) {
        for (int i = 0; i < count; i++) {
            data.add((int) (Math.random()*100));
        }
    }
    public static void deleteEven (ArrayList<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i)%2 == 0) {
                data.remove(i);
                i--;
            }
        }
    }
}
