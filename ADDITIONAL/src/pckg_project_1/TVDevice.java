package pckg_project_1;

public class TVDevice extends MediaDevice {
    private String currentChannel;
    private static final int MAX_CH = 999;

    protected TVDevice(String brand, String model) {
        super(brand, model);
        this.currentChannel = "1";
    }

    @Override
    public void turnONDevice() {
        System.out.println("Turning on TV device...");
    }

    @Override
    public void play() {
        System.out.println("Playing tv on the channel: " + currentChannel);
    }

    @Override
    public void pause() {
        System.out.println("Turn on recorder to record tv program...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in tv is equal to turn off!");
    }

    @Override
    public void next() {
        int channel = Integer.parseInt(currentChannel) + 1;
        if (channel == MAX_CH) {
            currentChannel = String.valueOf(1);
        } else {
            currentChannel = String.valueOf(channel);
        }
    }

    @Override
    public void previous() {
        int channel = Integer.parseInt(currentChannel) - 1;
        if (channel == 1) {
            currentChannel = String.valueOf(MAX_CH);
        } else {
            currentChannel = String.valueOf(channel);
        }
    }

    @Override
    public String toString() {
        return "TVDevice{" +
                "currentChannel='" + currentChannel + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
