import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> numlist = new ArrayList<>();
        {
            for (int i = 1; i <= 45; i++) {
                numlist.add(i);
            }
            System.out.println(numlist);
            Collections.shuffle(numlist);
            System.out.println(numlist);
            System.out.println("이번주 로또 번호는");

            for (int i = 0; i < 5; i++) {
                System.out.println(numlist.get(i));
            }
            System.out.println("보너스 번호는:");
            System.out.println(numlist.get(5));
        }
    }
}
