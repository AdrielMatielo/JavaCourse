import java.util.Scanner;

/*
Create a program to read two integers M and N,
and then read a matrix with M rows and N columns containing integers,
which may have repetitions.
Next, read an integer X that belongs to the matrix.
For each occurrence of X, display the values to the
left, above, to the right, and below X, when applicable.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] matrix = new int[x][y];
        for(int i=0; i< matrix.length; i++ ){
            for(int j=0; j< matrix[i].length; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int belong = sc.nextInt();
        for(int i=0; i< matrix.length; i++ ){
            for(int j=0; j< matrix[i].length; j++ ) {
                if(matrix[i][j] == belong){
                    System.out.println("Position "+i+","+j+":");
                    if(i==0){
                        if(j==0) {
                            System.out.println("Right: "+   matrix[i][j+1]);
                            System.out.println("Down: "+    matrix[i+1][j]);
                        }else if (j== matrix[i].length) {
                            System.out.println("Left: "+    matrix[i][j-1]);
                            System.out.println("Down: "+    matrix[i+1][j]);
                        }
                        System.out.println("Left: "+    matrix[i][j-1]);
                        System.out.println("Right: "+   matrix[i][j+1]);
                        System.out.println("Down: "+    matrix[i+1][j]);
                    }
                    if (i == matrix.length-1) {
                        if(j==0) {
                            System.out.println("UP: "+      matrix[i-1][j]);
                            System.out.println("Right: "+   matrix[i][j+1]);
                        }else if (j== matrix[i].length) {
                            System.out.println("UP: "+      matrix[i-1][j]);
                            System.out.println("Left: "+    matrix[i][j-1]);
                        }
                    }
                    if(j==0) {
                        System.out.println("UP: "+      matrix[i-1][j]);
                        System.out.println("Right: "+   matrix[i][j+1]);
                        System.out.println("Down: "+    matrix[i+1][j]);
                    }
                    if (j== matrix[i].length-1) {
                        System.out.println("UP: "+      matrix[i-1][j]);
                        System.out.println("Left: "+    matrix[i][j-1]);
                        System.out.println("Down: "+    matrix[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
