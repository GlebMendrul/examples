package domains;

/**
 * Created by gleb on 18.11.15.
 */
public class CarDomain implements PropertyDomain {

    private boolean isNew;
    private String name;

    public CarDomain(boolean isNew, String name) {
        this.isNew = isNew;
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return name;
    }

}
