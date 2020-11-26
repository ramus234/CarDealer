/**
 * Created by Frank on 17-11-2019.
 */
public class SportsCar extends Car {

    public SportsCar(int KM, String fuelType) {
        super(KM, fuelType);
    }

    public SportsCar(SportsCar sportsCar) {
        super(sportsCar.getKM(),sportsCar.getFuelType());
    }

    @Override
    public boolean equals(Object obj){
        if( obj == null ) {return false;}
        if( !obj.getClass().equals(this.getClass()) )
        {
            return false;
        }

        SportsCar otherTruck = (SportsCar) obj;
        if( this.getFuelType() == otherTruck.getFuelType()
                && this.getKM() == otherTruck.getKM()){
            return true;
        }
        else
        {
            return false;
        }

    }
}
