import java.util.Scanner;

public class sumarray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[][] number=new int[3][3];
        System.out.println("enter the number");
        int sum=0;
        for (int i=0;i<number.length;i++){
            for(int j=0;j<number[i].length;j++){
                number[i][j]=scanner.nextInt();
            }
        }
        for( int i=0;i< number.length;i++){
            for(int j=0;j<number[i].length;j++){
                sum+=number[i][j];

            }
        }
        System.out.println("sum of number:"+sum);
    }
}
