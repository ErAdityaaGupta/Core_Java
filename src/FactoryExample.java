// In this program we try to implement the factory design pattern.


abstract class Vehicle{
    public abstract int getWheel();

    public String toString(){
        return "Wheel" + this.getWheel();
    }
}

class Car extends Vehicle{
    int wheel;

    Car(int w){
        wheel = w;
    }

    public int getWheel(){
        return this.wheel;
    }
}

class Bike extends Vehicle{
    int wheel;

    Bike(int w){
        wheel = w;
    }

    public int getWheel(){
        return this.wheel;
    }
}

class VehicleFactory{
    public static Vehicle getInstance(String type,int wheel){
        if(type == "Car"){
            return new Car(wheel);
        }
        else if(type == "Bike"){
            return new Bike(wheel);
        }
        return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("Car",4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("Bike",2);
        System.out.println(bike);
    }
}
