import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class framelistmergeandshort {
    public static void main(String[]args){
        List<Integer>list1= new ArrayList<>(Arrays.asList(10, 20, 30));
        List<Integer>List2 =new ArrayList<>(Arrays.asList(22,33,44));
        List2.addAll(list1);
        Collections.sort(list1);
        System.out.println("merge and sort"+list1);
    }
}
