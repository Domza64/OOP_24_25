package pckg_abs_cls;

public class Camera extends Device {
    private String focus;

    public Camera(String brand, String modelName, String focus) {
        this.brand = brand;
        this.modelName = modelName;
        this.focus = focus;
    }

    @Override
    protected void recording() {
        System.out.println("Camera taking pictures");
    }

    @Override
    protected void recordingVideo() {
        System.out.println("Camera taking video");
    }
}
