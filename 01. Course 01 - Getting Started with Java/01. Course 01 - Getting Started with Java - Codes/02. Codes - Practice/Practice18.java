public class Practice18 {

    public static void main(String[] args) {

        int starsCount = 7;
        int newStarsDiscovered = 2;

        System.out.println("Total stars in the sky: " + (starsCount + newStarsDiscovered));
        System.out.println("Stars left after a black hole event: " + (starsCount - newStarsDiscovered));
        System.out.println("Stars observed through telescope enhancement: " + (starsCount * newStarsDiscovered));
        System.out.println("Result of dividing stars into constellations: " + (starsCount / newStarsDiscovered));
        System.out.println("Is there an odd number of stars? " + ((starsCount + newStarsDiscovered) % 2 != 0));
        
    }

}