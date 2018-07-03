import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {
    private static ArrayList<Integer> list = new ArrayList<>();
    public static int[] index;
    private static int sumVal;
    private static boolean exit = false;
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
        for (String s:input){
            list.add(Integer.parseInt(s));
            sumVal+=list.get(list.size()-1);
        }

        if (sumVal%2!=0){
            System.out.println("Cant do it!");
            System.exit(2);
        }

        index = new int[list.size()];
        for (int i = 0; i < index.length; i++) {
            index[i] =i;
        }

        int size=1;
        while (size<=index.length){
            int filled=0;
            int[] temp = new int[size];
            for (int i = 0; i < index.length; i++) {
                foo(temp,i,size,filled);
            }
            size++;
        }

    }

    public static void foo(int[] l,int i,int size,int filled){
        l[filled++]=index[i];
        if (size==filled){
            checkSum(l);
        } else {
            while (++i<index.length){
                foo(l,i,size,filled);
            }
        }
    }

    public static void checkSum(int[] iList){
        int sum=0;
        for (int anIndex : iList) {
            sum += list.get(anIndex);
        }

        if (sum==sumVal/2){

            int[] setTwo = new int[index.length-iList.length];
            for (int i = 0,k=0; i < index.length; i++) {
                boolean found=false;
                for (int j = 0; j < iList.length; j++) {
                    if (iList[j]==index[i]){
                        found=true;
                        break;
                    }
                }
                if (!found){
                    setTwo[k++] = index[i];
                }
            }

            System.out.println("Set 1:");
            for (int anIndex : iList) {
                System.out.print(list.get(anIndex)+" ");
            }
            System.out.println();
            System.out.println("Set 2:");
            for (int anIndex : setTwo) {
                System.out.print(list.get(anIndex)+" ");
            }
            System.out.println();

            System.exit(5);
        }
    }

}
