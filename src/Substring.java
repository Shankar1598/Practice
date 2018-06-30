import java.util.Scanner;

public class Substring {
    static String s1;
    static String s2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        s1 = scan.next();
        s2 = scan.next();
        boolean flag = false;

        for (int i = 0; i < s1.length(); i++) {
            int count=0;
            if (s1.charAt(i)==s2.charAt(0)){
                for (int j = 1; j < s2.length()&i+j<s1.length(); j++) {
                    if (s1.charAt(i+j)==s2.charAt(j)){
                        count++;
                    } else {
                        break;
                    }
                }
                if (count==s2.length()-1){
                    flag = true;
                    System.out.println("Found at: "+i);
                }
            }
        }

        if (!flag){
            System.out.println("Not found");
        }
    }
}
