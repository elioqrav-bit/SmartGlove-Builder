import java.util.ArrayList;
import java.util.List;

public class MedicalGloveBuilder implements SmartGloveBuilder {
    private Material material;
    private final List<String> sensors = new ArrayList<>();
    private Connectivity connectivity;
    private boolean hapticFeedback;

    @Override
    public SmartGloveBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public SmartGloveBuilder addSensor(String sensor) {
        this.sensors.add(sensor);
        return this;
    }

    @Override
    public SmartGloveBuilder setConnectivity(Connectivity type) {
        this.connectivity = type;
        return this;
    }

    @Override
    public SmartGloveBuilder setHapticFeedback(boolean hasHaptics) {
        this.hapticFeedback = hasHaptics;
        return this;
    }

    @Override
    public SmartGlove build() {
        if (material == null) {
            throw new IllegalStateException("Error: Medical glove must have material defined!");
        }
        return new SmartGlove(material, sensors, connectivity, hapticFeedback);
    }
}