import java.util.Arrays;
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        String text = "WELCOMETOZOHOCORPORATION";

        char[][] mat = new char[5][5];
        int k=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                try{
                    mat[i][j] = text.charAt(k++);
                }catch (StringIndexOutOfBoundsException e){
                    mat[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("enter string to search: ");
        String key = new Scanner(System.in).next();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j]==key.charAt(0)){
                    for (int l = 0; l < key.length(); l++) {

                    }
                }
            }
        }


    }
}
