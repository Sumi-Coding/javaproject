public class bufferbulidertostring {
    public static void main(String[] args){
        StringBuffer sbr=new StringBuffer("sumi");
        StringBuilder sbl=new StringBuilder("thra");
        String s1=sbr.toString();
        System.out.println(s1);
        String s2= sbl.toString();
        System.out.println(s2);
        sbr.append("sathiya");
        System.out.println(sbr);
        System.out.println(s1);

    }
}
