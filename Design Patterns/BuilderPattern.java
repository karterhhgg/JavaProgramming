public class BuilderPattern {
    
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i7", 16)
                .setStorage(512)
                .setGraphicsCard("NVIDIA RTX 4060")
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer);
    }
}

/**
 * The Computer class represents a computer configuration.
 * It is built using the Builder design pattern, which helps in
 * creating immutable objects with optional parameters.
 *
 * <p>Usage example:</p>
 * <pre>{@code
 * Computer computer = new Computer.Builder("Intel i7", 16)
 *         .setStorage(512)
 *         .setGraphicsCard("NVIDIA GTX 1660")
 *         .build();
 * }</pre>
 */
class Computer {

    // Required parameters
    private final String cpu;
    private final int ram;

    // Optional parameters
    private final int storage;
    private final String graphicsCard;
    private final boolean bluetoothEnabled;

    /**
     * Private constructor. Objects should be created using the {@link Builder}.
     *
     * @param builder the Builder instance containing values
     */
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    // Getters (no setters to ensure immutability)
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", GraphicsCard='" + graphicsCard + '\'' +
                ", BluetoothEnabled=" + bluetoothEnabled +
                '}';
    }

    /**
     * Builder class for constructing {@link Computer} objects.
     * <p>
     * Example usage:
     * <pre>{@code
     * Computer pc = new Computer.Builder("AMD Ryzen 9", 32)
     *     .setStorage(1024)
     *     .setBluetoothEnabled(true)
     *     .build();
     * }</pre>
     */
    public static class Builder {
        // Required parameters
        private final String cpu;
        private final int ram;

        // Optional parameters (default values)
        private int storage = 256;
        private String graphicsCard = "Integrated";
        private boolean bluetoothEnabled = false;

        /**
         * Builder constructor with required parameters.
         *
         * @param cpu the CPU of the computer
         * @param ram the RAM size in GB
         */
        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        /**
         * Sets the storage size of the computer.
         *
         * @param storage storage size in GB
         * @return the current Builder instance
         */
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Sets the graphics card of the computer.
         *
         * @param graphicsCard the name of the graphics card
         * @return the current Builder instance
         */
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        /**
         * Enables or disables Bluetooth.
         *
         * @param bluetoothEnabled true if Bluetooth should be enabled
         * @return the current Builder instance
         */
        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        /**
         * Builds and returns a {@link Computer} object.
         *
         * @return a new Computer instance
         */
        public Computer build() {
            return new Computer(this);
        }
    }
}