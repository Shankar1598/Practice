import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortWithWeight {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));
        ArrayList<Integer> w = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            w.add(i,0);
            int n = Integer.parseInt(s.get(i));
            double sqrt = Math.sqrt(n);
            if (sqrt == Math.floor(sqrt)){
                w.set(i,w.get(i)+5);
            }
            if (n%2==0){
                w.set(i,w.get(i)+3);
            }
            if ((n%100)%4==0 & n%6==0){
                w.set(i,w.get(i)+4);
            }
        }

        for (int i = 0; i < w.size(); i++) {
            for (int j = 0; j < w.size(); j++) {
                if (w.get(i)>w.get(j)){
                    int t = w.get(i);
                    w.set(i,w.get(j));
                    w.set(j,t);

                    String c= s.get(i);
                    s.set(i,s.get(j));
                    s.set(j,c);
                }
            }
        }
        System.out.println(w);
        System.out.println(s);
    }
}
