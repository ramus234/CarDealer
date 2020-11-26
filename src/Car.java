/**
 * Created by Frank on 17-11-2019.
 */
public class Car extends Vehicle {
    private int KM;
    private String fuelType;

    public Car(int KM, String fuelType) {
        this.KM = KM;
        this.fuelType = fuelType;
    }


    public Car(Car car) {
        this.KM = car.KM;
        this.fuelType = car.fuelType;
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

        Car otherTruck = (Car)obj;
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
