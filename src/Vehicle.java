/**
 * Created by Frank on 17-11-2019.
 */
public abstract class Vehicle {
    public abstract int getKM();
    public abstract String getFuelType();

    @Override
    public boolean equals(Object obj){
        if( obj == null ) {return false;}
        if( !obj.getClass().equals(this.getClass()) )
        {
            return false;
        }

        Vehicle otherTruck = (Vehicle) obj;
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
