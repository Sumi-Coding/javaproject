import java.util.HashSet;
import java.util.Set;

public class freamesethashset {
    public static void main(String[] args){
        Set<String>fruits=new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        System.out.println("fruits:"+fruits);
    }
}
