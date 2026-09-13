import java.util.List;

enum Connectivity { BLUETOOTH, WI_FI, USB_C }
enum Material { NEOPRENE, SILICONE, SPANDEX }

public class SmartGlove {
    private final Material material;
    private final List<String> sensors;
    private final Connectivity connectivity;
    private final boolean hapticFeedback;

    public SmartGlove(Material material, List<String> sensors, Connectivity connectivity, boolean hapticFeedback) {
        this.material = material;
        this.sensors = sensors;
        this.connectivity = connectivity;
        this.hapticFeedback = hapticFeedback;
    }

    @Override
    public String toString() {
        return "SmartGlove [Material=" + material + ", Sensors=" + sensors +
                ", Connectivity=" + connectivity + ", Haptics=" + hapticFeedback + "]";
    }
}