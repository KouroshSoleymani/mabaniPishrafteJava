import khodro.Car;
import khodro.Khodro;
import khodro.Motor;
import khodro.NamKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {
    @Test
    void BayadNamKhodroChapKonad() {

        Khodro benz = new Car("Benz", 120, "automatic");

        Khodro volvo = new Car("volvo", 80, "dasti");

        Khodro motor = new Motor();

        Khodro kashti = new Kashti();

        Khodro[] KhodroHa = {benz,volvo,motor,kashti};

        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(KhodroHa);

        String ListNamKhodroHa = namKhodroChapKon.execute();

        Assertions.assertEquals("Benz-volvo-Motor-kashti",ListNamKhodroHa);

    }


}
