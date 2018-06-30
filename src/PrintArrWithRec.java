import java.util.Scanner;

public class PrintArrWithRec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.next().split(" ");
        System.out.println(foo(arr,arr.length-1));
    }

    public static String foo(String[] arr, int index){
        if (index==0){
            return arr[0];
        }
        return arr[index]+" "+foo(arr,index-1);
    }
}
