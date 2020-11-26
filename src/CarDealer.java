/**
 * Created by Frank on 17-11-2019
 */
public class CarDealer {

    public double estimateCarValue(Car car){
        return car.getKM() * 2;
    }
    public double estimateCarValue(Truck car){
        return car.getKM() * 4;
    }



}
