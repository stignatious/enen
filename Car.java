public class Car {
    String model;
    String name;
    double price;
    String owner;
    //function to set car data
    void setCar(String model,String name,double price,String owner){
        this.model=model;
        this.name=name;
        this.price=price;
        this.owner=owner;
    }
    //function to display Car data
    void display Car(){
        System.out.println("Car Model:"+model);
        System.out.println("Car Name:"+name);
        System.out.println("Car Price:$"+price);
        System.out.println("Car Owner:"+owner);
    }
}
public class CarRunner{
    public static void main(String[]args){
        //create three Car objects
        Car Car1= new Car();
        Car Car2= new Car();
        Car Car3= new Car();
        //set data for first car
        Car1.setCar("Toyota","Camry",25000.0,"John");
        //set data for second car
        Car2.setCar("Honda","Civic",22000.0,"Alice");
        //set data for third car
        Car3.setCar("Ford","F-150",35000.0,"Bob");
        //display data for all three cars
        System.out.println("Car1:");
        Car1.display Car();
        System.out.println("\nCar2:");
        Car2.display Car();
        System.out.println("\nCar3:");
        Car3.display Car();
        }
}

