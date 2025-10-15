public class arraytwoDdeclae {
    public static void main(String[] args){
        String name[][]={{"ravi,kannagi"},{"pavi,abi"}};
        System.out.println("enter the name");
        for(int i=0;i<name.length;i++){
            for(int j=0;i< name.length;i++){
                System.out.println(name[i][j]+"\t");
            }
        }
    }
}
