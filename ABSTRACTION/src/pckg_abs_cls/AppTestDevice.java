package pckg_abs_cls;

public class AppTestDevice {

    public static void main(String[] args) {
        Device mp = new MobilePhone("asd", "asd");
        Device camera = new Camera("asd", "asdasd", "asd");
        test(mp, camera);
    }

    private static void test(Device... device) {
        for (Device d : device) {
            d.chargeDevice();
        }
    }
}
