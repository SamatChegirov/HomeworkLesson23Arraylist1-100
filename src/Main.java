import java.util.ArrayList;
import java.util.Random;

/*ArrayList тузунуз
        1ден 100го чейинки 50 сан менен толтурунуз
        Дагы 2 ArrayList тузуп бирисине жогорудагы келген сандардын так сандардын, экинчисине жуп сандардын салыныз
        Аларды консольго чыгарыныз*/
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayInt = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayInt.add(random.nextInt(1, 100));
        }

        ArrayList<Integer> jupSan = new ArrayList<>();
        for (int i = 0; i < arrayInt.size(); i++) {
            int js = arrayInt.get(i);
            if (js % 2 == 0) {
                jupSan.add(js);
            }
        }
        ArrayList<Integer> takSan = new ArrayList<>();
        for (int i = 0; i < arrayInt.size(); i++) {
            int ts = arrayInt.get(i);
            if (ts % 2 == 1) {
                takSan.add(ts);
            }
        }
        System.out.println(arrayInt);
        System.out.println(takSan);
        System.out.println(jupSan);


    }
}