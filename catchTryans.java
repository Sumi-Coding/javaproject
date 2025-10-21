public class catchTryans {
    public static void main(String[] args){
        int[] number={10,20,30};
        try {
            System.out.println(number[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: index out of range");
        }

    }
}
