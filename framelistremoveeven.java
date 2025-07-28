import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class framelistremoveeven {
    public static void main(String[] args){
        List<Integer> number=new ArrayList<>(Arrays.asList(10,23,33,44,67));
        System.out.println("all number:"+number);
        number.removeIf(n->n%2==0);
        System.out.println("remove even number"+number);
    }
}
