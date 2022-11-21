package khodro;

public class Ranande {

    private  String noeGovahiname = "paye 1";
    private static String name = "farhad";


    public class GovahiName{

        public void print(){
            System.out.println("class non-static :");
            System.out.println(noeGovahiname);
            System.out.println(name);
        }

    }
    public static class StaticGovahiName{

        public void print(){
            System.out.println("class non-static :");
            //System.out.println(noeGovahiname);
            System.out.println(name);
        }

    }
}
