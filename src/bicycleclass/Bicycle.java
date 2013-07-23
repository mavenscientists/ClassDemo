package bicycleclass;

/**
 * 
 * @author karan
 * @date 15 July 2013
 */
public class Bicycle
{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear =  gear;
        this.speed = speed;
    }
  
    void gearChange(int newValue)
    {
        gear = newValue;
    }
    
    void speedUp(int increment)
    {
        speed += increment;
    }
    
    void speedDown(int decrement)
    {
        speed -= decrement;
    }
    
    public static void main(String[] args)
    {
        // Creating Objects of Class Bicycle
        Bicycle bicycle1 = new Bicycle(0, 0); 
        Bicycle bicycle2 = new Bicycle(1, 5);
        
        // Object - 1: Bicycle1 (Default State)
        System.out.println("Bicycle1 - (Default State)" );
        System.out.println("\tGear  : " + bicycle1.gear);
        System.out.println("\tSpeed : " + bicycle1.speed);
        // Object - 2: Bicycle2 (Default State)
        System.out.println("Bicycle2 - (Default State)" );
        System.out.println("\tGear  : " + bicycle2.gear);
        System.out.println("\tSpeed : " + bicycle2.speed);
        
        //changing (state)field values by calling methods
        bicycle1.gearChange(1);
        bicycle1.speedUp(2);
        bicycle2.speedUp(4);
        bicycle2.gearChange(2);
        
        // Object - 1: Bicycle1 (New State)
        System.out.println("\nBicycle1 - (New State)" );
        System.out.println("\tGear  : " + bicycle1.gear);
        System.out.println("\tSpeed : " + bicycle1.speed);
        // Object - 2: Bicycle2 (New State)
        System.out.println("Bicycle2 - (New State)" );
        System.out.println("\tGear  : " + bicycle2.gear);
        System.out.println("\tSpeed : " + bicycle2.speed);
        
    }
    
}
