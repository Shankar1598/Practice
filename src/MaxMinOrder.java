import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMinOrder {
    public static void main(String[] args) {
//        String[] input = ;
        ArrayList<Integer> list = new ArrayList<>();
        for (String n:new Scanner(System.in).nextLine().split(" ")){
            list.add(Integer.parseInt(n));
        }

        list.sort((o1, o2) -> {
            if (o1==o2){
                return 0;
            }
            if (o1<o2){
                return -1;
            }
            return 1;
        });

        for (int i = 0; i < list.size()/2; i++) {
            System.out.print(list.get(list.size()-i-1)+" "+list.get(i)+" ");
        }
        if (list.size()%2!=0){
            System.out.print(list.size()/2+1);
        }

    }
}
