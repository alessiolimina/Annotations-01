package it.develhope.annotations;


/**
 * This is a Tester class
 * @author alessiolimina
 */

public class Start {

    /**
     * Suppressing the deprecation warnings using the related annotation @SuppressWarnings("deprecation")
     */

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        System.out.println("----------------Starting--------------------");

        /**
         * Creating a new Car object
         * calling the deprecated method printCarDetails
         * calling the method getCarDetails
         */

        Car car = new Car("Mercedes S Class", 15600);
        car.printCarDetails();
        car.getCarDetails();

        System.out.println("----------------------------------------------");

    }
}

