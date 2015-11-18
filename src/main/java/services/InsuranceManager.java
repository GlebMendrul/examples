package services;


import domains.PropertyDomain;
import view.Writeable;

import java.io.IOException;

/**
 * Created by gleb on 18.11.15.
 */
public class InsuranceManager {

    private static InsuranceManager insuranceManager;

    private Writeable writeable;

    public synchronized static InsuranceManager getInsuranceManager() {
        if (insuranceManager == null) {
            insuranceManager = new InsuranceManager();
        }
        return insuranceManager;
    }

    public void insure(PropertyDomain property) throws IOException {
        if(checkNew(property)) {
            write(property.toString());
        }
    }

    private void write(String message) throws IOException {
        writeable.write(message);
    }

    private boolean checkNew(PropertyDomain property) {
        return property.isNew();
    }

    public void setWriteable(Writeable writeable) {
        this.writeable = writeable;
    }


}
