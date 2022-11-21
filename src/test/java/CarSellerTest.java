import frooshande.Frooshande;
import khodro.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarSellerTest {
    @Test
    void BayadTedadKoleMashinHayeFrookhteShodeRaBeDastAvarid() {

        Frooshande frooshande = new Frooshande();

        frooshande.forosheMashin();

        Car car = new Car();


        Assertions.assertEquals(1,car.tedadFroosh);
    }
}
