public class Practice15 {
    
    public static void main(String[] args) {
        
        int safeLandingMaxSpeed = 1000; // maximum safe landing speed in km/h
        int spacecraftSpeed = 1200; // current spacecraft speed in km/h

        boolean isTooFastForLanding = spacecraftSpeed > safeLandingMaxSpeed;
        
        System.out.println("Is the spacecraft moving too fast for a safe landing? " + isTooFastForLanding);
        
    }
    
}