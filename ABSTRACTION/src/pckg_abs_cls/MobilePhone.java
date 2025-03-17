package pckg_abs_cls;

public class MobilePhone extends Device implements InternetFunctinality {

    public MobilePhone(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    @Override
    protected void recording() {
        System.out.println("Phone taking pictures...");
    }

    @Override
    protected void recordingVideo() {
        System.out.println("Phone recording video...");
    }

    @Override
    public void saveToCloud() {

    }

    @Override
    public void searchTheWeb() {

    }
}
