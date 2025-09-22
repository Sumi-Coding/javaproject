public class typecostingcabfare {
    public static void main(String[] args){
        String passenger="meena";
        double distance=12.75;
        double rateperkm=14.50;
        double fare=distance*rateperkm;
        int finalfare=(int) fare;
        System.out.println("===cab ride summary===");
        System.out.println("passenger:"+passenger);
        System.out.println("distance:"+distance);
        System.out.println("rate Par Km:"+rateperkm);
        System.out.println("fare(exact):"+fare);
        System.out.println("final fare(rounded):"+finalfare);

    }
}
