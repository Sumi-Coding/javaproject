import java.util.Scanner;

public class scanarray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number[][]=new int[3][4];
            System.out.println("enter the matrix values 3*4 array:");
            for(int i=0;i< number.length;i++) {
                for (int j = 0; j < number[i].length; j++) {
                  number[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Entered the values");
            for(int i=0;i< number.length;i++){
                for(int j=0;j< number[i].length;j++) {
                  System.out.println(number[i][j]+"");
                }
                        System.out.println();
                }
    }
}





