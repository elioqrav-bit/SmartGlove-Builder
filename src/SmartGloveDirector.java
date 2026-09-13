public class SmartGloveDirector {
    public void buildStandardVRGlove(SmartGloveBuilder builder) {
        builder.setMaterial(Material.SPANDEX)
                .addSensor("Gyroscope")
                .addSensor("Accelerometer")
                .setConnectivity(Connectivity.BLUETOOTH)
                .setHapticFeedback(true);
    }

    public void buildRehabMedicalGlove(SmartGloveBuilder builder) {
        builder.setMaterial(Material.SILICONE)
                .addSensor("Precision Flex Sensor")
                .addSensor("Heart Rate Sensor")
                .setConnectivity(Connectivity.USB_C)
                .setHapticFeedback(false);
    }
}