public class Practice16 {

    public static void main(String[] args) {

        int starLightSpeed = 299792; // Speed of light from a star in km/s
        int spacecraftSpeed = 40000; // Speed of spacecraft in km/s

        // Determine if our spacecraft can travel faster than starlight
        System.out.println("Can our spacecraft outrun starlight? " + (spacecraftSpeed > starLightSpeed));

    }

}