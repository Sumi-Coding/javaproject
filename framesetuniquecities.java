import java.util.HashSet;

public class framesetuniquecities {
    public static void main(String[] args){
        HashSet<String>cities=new HashSet<>();
        cities.add("chennai");
        cities.add("mumbai");
        cities.add("chennai");
        cities.add("delhi");
        System.out.println("cities:"+cities);
    }
}
