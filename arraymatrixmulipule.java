import java.util.Scanner;

public class arraymatrixmulipule {
    public static void main(String[] args) {
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];
        int result[][] = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Element A matrix are 2*3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The Element B matrix are 2*3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j]=0;
                for(int k=0;k<3;k++) {
                    result[i][j] = A[i][k] * B[i][k];
                }
            }
        }
        System.out.println("The multiplication matrix are ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(result[i][j] + "");
            }
            System.out.println();
        }
    }
}

