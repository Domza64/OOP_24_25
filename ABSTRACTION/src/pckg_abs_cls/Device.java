package pckg_abs_cls;

public abstract class Device {

    protected String brand;
    protected String modelName;

    public void chargeDevice() {
        System.out.println("Charging " + getClass().getSimpleName());
    }

    protected abstract void recording();
    protected abstract void recordingVideo();
}
