package it.develhope.annotations;

/**
 * This class includes the car details
 * @author alessiolimina
 */

public class Car {

    /**
     * Creating the instance variables
     */

    private String modelName;
    private int mileAge;

    /**
     * This constructor method assigns the params to the instance variables
     * @param modelName is car's model name
     * @param mileAge is the car age in miles
     */

    public Car(String modelName, int mileAge){
        this.modelName = modelName;
        this.mileAge = mileAge;
    }

    /**
     * This is a deprecated method
     * this method prints the car details in just one line
     */

    @Deprecated
    public void printCarDetails(){
        System.out.println("The model name is " + modelName + " and it has traveled " + mileAge + " miles");
    }

    /**
     * This method prints the car details in multiple lines
     */

    public void getCarDetails(){
        System.out.printf("The model name is %s %n", modelName);
        System.out.printf("This car has traveled for %d miles %n", mileAge);
    }
}

