import java.util.ArrayList;

/**
 * Created by Frank on 17-11-2019.
 */
public class TestClass {

    public static void main(String[] args) {
        Car carObj = new Car(100,"petrol");
        SportsCar sCarObj = new SportsCar(200,"petrol");
        Truck tObj = new Truck(500,"diesel");
        Truck tObj2 = new Truck(500,"diesel");
        Truck tObj3 = new Truck(tObj);

        SportsCar sportsCar = new SportsCar(500,"diesel");
        SportsCar sportsCar1 = new SportsCar(500,"diesel");

        System.out.println(sportsCar.equals(sportsCar1));

        System.out.println("== " + (tObj == tObj2));
        System.out.println( "Are the two trucks equal: " + tObj.equals(tObj2) );

        System.out.println( "compare truck copy: " + tObj.equals(tObj3) );

        CarDealer cd = new CarDealer();
        System.out.println(cd.estimateCarValue(carObj));
        System.out.println(cd.estimateCarValue(sCarObj));
        //System.out.println(cd.estimateCarValue(tObj));





        ArrayList<String> myArray = new ArrayList<>();
        ArrayList<String> myArray3 = (ArrayList<String>)myArray.clone();
        ArrayList<String> myArray2 = new ArrayList<>(myArray);



    }
}
