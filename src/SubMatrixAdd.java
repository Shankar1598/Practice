import java.util.Scanner;

public class SubMatrixAdd {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        Scanner scan = new Scanner(System.in);

        int[] index = new int[2];
        index[0] = scan.nextInt();
        index[1] = scan.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j]=j+1;
            }
        }

        for (int i = 0; i < 4; i+=index[0]) {
            for (int j = 0; j < 4; j+=index[1]) {
                int sum =0;
                for (int k = i; k < i+index[0]; k++) {
                    for (int l = j; l < j+index[1]; l++) {
                        sum+=mat[k][l];
                    }
                }
                System.out.println(sum);
            }
        }


    }

    private static int[] getIntArray(String[] s){
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        return ints;
    }
}
