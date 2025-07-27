import java.util.ArrayList;
import java.util.List;

public class framelistarrayshoping {
    public static void main(String[] args){
        List<String>items=new ArrayList<>();
        items.add("salt");
        items.add("sugar");
        items.add("milk");
        items.remove("milk");
        System.out.println("items"+items);

    }
}
