import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class framecollectiondescendingreversOder {
    public static void main(String[] args){
        Integer[]num={1,78,8,9,5};
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
    }
}
