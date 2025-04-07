package pckg_inner_2;

public class Computer {
    private String brand;
    private Processor processor;
    private RAM ram;

    public Computer(String brand, String processorModel, double processorFrequency, int systemMemCapacity) {
        this.brand = brand;
        this.processor = new Processor(processorModel, processorFrequency);
        this.ram = new RAM(systemMemCapacity);
    }

    class Processor {
        String processorModel;
        double processorFrequency;

        public Processor(String processorModel, double processorFrequency) {
            this.processorModel = processorModel;
            this.processorFrequency = processorFrequency;
        }

        public void bootOperatingSystem() {
            System.out.println("Processor: " + processor.processorModel + " is booting OS in computer: " + brand);
        }
    }
    static class RAM {
        int capacity;
        public RAM(int systemMemCapacity) {
            this.capacity = systemMemCapacity;
        }

        public void testSystemRam() {
            System.out.println("System Ram working, capacity: " + capacity);
        }
    }

    public void checkCompTemperature() {
        class TemperatureSensor {
            private double temp;
            private static final double MAXT = 120.0;
            private static final double MINT = 20.0;

            public void checkTemperature() {
                this.temp = MINT + Math.random() * (MAXT - MINT);
            }

            public double getTemp() {
                return this.temp;
            }
        }

        TemperatureSensor temp = new TemperatureSensor();
        temp.checkTemperature();
        System.out.println("Temperature: " + temp.getTemp());
    }

    public void bootComputer() {
        Runnable boot = new Runnable() {
            @Override
            public void run() {
                processor.bootOperatingSystem();
            }
        };
        new Thread(boot).start();

//        TestComputer testComputer = new TestComputer() {
//            @Override
//            public void runTest() {
//                processor.bootOperatingSystem();
//            }
//        };
        TestComputer testComputer = () -> processor.bootOperatingSystem();
        testComputer.runTest();
    }
}
