public class Main {
    public static void main(String[] args) {
        SmartGloveDirector director = new SmartGloveDirector();

        // 1. Создание VR перчатки через Director
        SmartGloveBuilder vrBuilder = new VRGamingGloveBuilder();
        director.buildStandardVRGlove(vrBuilder);
        SmartGlove vrGlove = vrBuilder.build();
        System.out.println("VR Glove: " + vrGlove);

        // 2. Создание медицинской перчатки через Director
        SmartGloveBuilder medicalBuilder = new MedicalGloveBuilder();
        director.buildRehabMedicalGlove(medicalBuilder);
        SmartGlove medicalGlove = medicalBuilder.build();
        System.out.println("Medical Glove: " + medicalGlove);

        // 3. Кастомная перчатка через Fluent API (цепочку вызовов)
        SmartGlove customGlove = new VRGamingGloveBuilder()
                .setMaterial(Material.NEOPRENE)
                .addSensor("Custom EMG Sensor")
                .setConnectivity(Connectivity.WI_FI)
                .setHapticFeedback(true)
                .build();
        System.out.println("Custom Glove: " + customGlove);
    }
}