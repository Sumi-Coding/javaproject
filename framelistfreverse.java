import java.util.*;

public class framelistfreverse {
    public static void main(String[] args){
        List<Integer>revers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("all numbers"+revers);
        Collections.reverse(revers);
        System.out.println("revers:"+revers);
    }
}
