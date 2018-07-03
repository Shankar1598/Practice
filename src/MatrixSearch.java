import java.util.Scanner;

public class MatrixSearch {

    private static char[][] mat = new char[5][5];
    private static boolean found = false;

    public static void main(String[] args) {
        String text = "WELCOMETOZOHOCORPORATION";
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

        if (!search(key,1))
            search(key,0);

        if (!found){
            System.out.println("Not found");
        }
    }

    private static boolean search(String key,int d){
        found =false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j]==key.charAt(0)){
                    int count=0;
                    for (int l = 0; l < key.length(); l++) {
                        if (d==1 & i+l<5){
                            if (mat[i+l][j]==key.charAt(l)){
                                count++;
                                continue;
                            }
                        } else if (j+l<5){
                            if (mat[i][j+l]==key.charAt(l)){
                                count++;
                                continue;
                            }
                        }
                        break;
                    }
                    if (count==key.length()){
                        found = true;
                        System.out.println("Found at "+i+" "+j);
                        break;
                    }
                }
            }
            if (found) break;
        }
        return found;
    }
}
