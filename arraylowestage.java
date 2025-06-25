public class arraylowestage {
    public static void main(String[] args){
       int[] age={23,34,45,56,56};
        int minage=age[0];
        for(int i:age){
            if(i<minage){
                i=minage;
            }
        }
        System.out.println("enter the lowest age"+minage);
    }
}
