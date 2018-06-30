import java.util.Scanner;

class PrintCharGivenTimes {
    static String input;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        input = scan.next();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c) && Character.isAlphabetic(c)){
                int count = getNextNumber(i);
                for (int j = 0; j < count; j++) {
                    System.out.print(input.charAt(i));
                }
            }
        }
    }

    private static int getNextNumber(int index) {
        int no = Character.getNumericValue(input.charAt(index+1));
        if (input.length() > index+2){
            if (Character.isDigit(input.charAt(index+2))){
                no = (no*10) + Character.getNumericValue(input.charAt(index+2));
            }
        }
        return no;
    }
}