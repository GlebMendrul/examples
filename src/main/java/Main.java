import domains.BikeDomain;
import domains.CarDomain;
import services.InsuranceManager;
import view.ConsoleWritable;

import java.io.IOException;

/**
 * Created by gleb on 18.11.15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CarDomain carDomain = new CarDomain(true, "car 1");
        BikeDomain bikeDomain = new BikeDomain(true, "bike 1");
        InsuranceManager manager = InsuranceManager.getInsuranceManager();
        manager.setWriteable(new ConsoleWritable());
        manager.insure(carDomain);
        manager.insure(bikeDomain);
    }
}
