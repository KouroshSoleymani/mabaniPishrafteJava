import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanandeTest {
    @Test
    void mustPrintNoeGovahiNameAndName() {
        Ranande ranande = new Ranande();
        Ranande.GovahiName govahiName = ranande.new GovahiName();
        govahiName.print();
    }

    @Test
    void mustPrintName() {
        Ranande.StaticGovahiName staticGovahiName = new Ranande.StaticGovahiName();
        staticGovahiName.print();
    }
}
