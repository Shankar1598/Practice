import java.util.ArrayList;
import java.util.Scanner;


public class MergeSet {
    static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = getIntArray(scan.next().split(","));
        int[] arr2 = getIntArray(scan.next().split(","));

        for (int n : arr1) {
            res.add(n);
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean added = false;
            int j;
            for (j = 0; j < res.size(); j++) {
                if (arr2[i]==res.get(j)){
                    break;
                } else if (arr2[i]<res.get(i)){
                    res.add(i,arr2[i]);
                    added=true;
                    break;
                }
            }
            if (j==res.size() & !added){
                res.add(arr2[i]);
            }
        }

        System.out.println(res.toString());

    }

    private static int[] getIntArray(String[] s){
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }

    private static void add(int no){
        if (!contains(res,no)){
            res.add(no);
            System.out.println("Added:"+no);
        }
    }

    private static boolean contains(ArrayList<Integer> list,int n){
        for (Integer i:list){
            if (i==n){
                return true;
            }
        }
        return false;
    }
}
