import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {
    static String input;
    static int[] nos;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        nos = getIntArray(input.split(","));

        for (int i = 0; i < nos.length; i++) {
            for (int j = 0; j < nos.length; j++) {
//                System.out.println(i+" "+j+" : "+nos[i]+" "+nos[j]);
                if (i%2==0 & j%2==0){
                    if (nos[i]>nos[j]){
                        int t=nos[i];
                        nos[i]=nos[j];
                        nos[j]=t;
                    }
                } else if (i%2!=0 & j%2!=0){
                    if (nos[i]<nos[j]){
                        int t=nos[i];
                        nos[i]=nos[j];
                        nos[j]=t;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nos));

    }
    private static int[] getIntArray(String[] s){
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }
}
