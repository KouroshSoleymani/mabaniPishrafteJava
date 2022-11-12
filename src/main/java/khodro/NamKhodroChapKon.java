package khodro;

public class NamKhodroChapKon {

    Khodro[] khodroha;

    public NamKhodroChapKon(Khodro[] khodroha){

        this.khodroha = khodroha;

    }
    public String execute() {

        String nameKhodroHa = "";


        for (int i = 0;i < khodroha.length;i++){

            Khodro khodro = khodroha[i];

            if(i < khodroha.length - 1){
                nameKhodroHa = nameKhodroHa + khodro.getBrand()+"-";
            }else{
                nameKhodroHa = nameKhodroHa + khodro.getBrand();
            }

        }

        return nameKhodroHa;
    }
}
