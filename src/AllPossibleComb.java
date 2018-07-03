import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class AllPossibleComb{

    private static ArrayList<String> list = new ArrayList<>(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));

    public static void main(String[] args) {

        int size = 1;
        while (size<=list.size()) {
            int filled = 0;
            int[] l = new int[size];
            for (int i = 0; i < list.size(); i++) {
                foo(l, i, size, filled);
            }
            size++;
        }
    }
    public static void foo(int[] l,int i,int size,int filled){
        l[filled++]=Integer.parseInt(list.get(i));
        if(filled==size){
            System.out.println(Arrays.toString(l));
        } else {
            while (++i<list.size()){
                foo(l,i,size,filled);
            }
        }
    }
}