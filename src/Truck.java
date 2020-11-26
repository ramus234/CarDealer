/**
 * Created by Frank on 17-11-2019.
 */
public class Truck extends Vehicle {
    private int KM;
    private String fuelType;

    public Truck(int KM, String fuelType) {
        this.KM = KM;
        this.fuelType = fuelType;
    }

    public Truck(Truck truck) {
        this.KM = truck.KM;
        this.fuelType = truck.fuelType;
    }

    @Override
    public int getKM() {
        return KM;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public boolean equals(Object obj){
        if( obj == null ) {return false;}
        if( !obj.getClass().equals(this.getClass()) )
        {
            return false;
        }

        Truck otherTruck = (Truck)obj;
        if( this.fuelType == otherTruck.fuelType
                && this.KM == otherTruck.KM){
            return true;
        }
        else
        {
            return false;
        }

    }

}
