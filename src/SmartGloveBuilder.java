public interface SmartGloveBuilder {
    SmartGloveBuilder setMaterial(Material material);
    SmartGloveBuilder addSensor(String sensor);
    SmartGloveBuilder setConnectivity(Connectivity type);
    SmartGloveBuilder setHapticFeedback(boolean hasHaptics);
    SmartGlove build();
}
