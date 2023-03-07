package ch03;

public class que03 {
    public static void main(String[] args) {
        String ssn = "881120-1068234";
        System.out.println("YYMMDD:"+"19"+ssn.substring(0,6));
        System.out.println("OUTNUM:"+ssn.substring(7,14));
    }
}
