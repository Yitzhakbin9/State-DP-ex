package State;

public class main {
    public static void main(String[] args) {


        DirectionService directionService = new DirectionService();

        directionService.setTravelMode(new Bicycling());
        System.out.println("**  Travel by Bicycle  **");
        directionService.getDirection();
        directionService.getEta();
        System.out.println();

        System.out.println("**  Travel by Driving  **");
        directionService.setTravelMode(new Driving());
        directionService.getDirection();
        directionService.getEta();
        System.out.println();


        System.out.println("**  Travel by Walking  **");
        directionService.setTravelMode(new Walking());
        directionService.getDirection();
        directionService.getEta();



    }
}
