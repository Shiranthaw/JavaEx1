// Dynamic Polymorphism example

class Vehicle
{
    public void move()
    {
    	System.out.println("Method in class Vehicle is called");
    }
}

class MotorBike extends Vehicle
{
    public void move()
    {
    	System.out.println("Method in class MotorBike is called");
    }
}

class DynamicPolymorphism
{
    public static void main(String[] args)
    {
	    Vehicle vh=new MotorBike();
	    vh.move();    // prints MotorBike can move and accelerate too!!
	    
	    vh=new Vehicle();
	    vh.move();    // prints Vehicles can move!!
    }
}

//Out Put:
//Method in class MotorBike is called
//Method in class Vehicle is called