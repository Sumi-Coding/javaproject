public class buffertobuilderconvert {
    public static void main(String[] args){
        StringBuffer sbr=new StringBuffer("sumi");
        String s= sbr.toString();
        StringBuilder sbl=new StringBuilder(s);
        System.out.println(sbl);
    }
}
