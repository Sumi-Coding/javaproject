public class arraycolumnsum {
    public static void main(String[] args){
        int[][] sum={{2,3,4},{1,2,3},{5,6,7}};
        int rows=sum.length;
        int column=sum[0].length;
        for(int j=0;j<sum.length;j++){
            int value=0;
            for (int i=0;i<sum.length;i++){
                value+=sum[i][j];
            }
            System.out.println("sum of column"+(j+1)+"="+ value);

        }
    }
}
