import java.util.HashSet;
import java.util.Set;

public class framesetemployeeid {
    public static void main(String[] args){
        Set<Integer>employeeId=new HashSet<>();
        employeeId.add(123);
        employeeId.add(456);
        employeeId.add(789);
        employeeId.add(123);
        employeeId.add(345);
        System.out.println("employeeId:"+employeeId);

    }
}
