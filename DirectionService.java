package State;

public class DirectionService {

    private TravelMode travelMode;

    public DirectionService(){}

    public void getEta(){
        travelMode.getEta();
    }

    public void getDirection(){
        travelMode.getDirection();
    }


    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
