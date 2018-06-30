import java.util.Scanner;

public class PrintXShape {
    static String input;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input = scan.next();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i==j){
                    System.out.print(input.charAt(i));
                } else if (i+j==input.length()-1){
                    System.out.print(input.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
