package com.Ride;
public class RideSharingApp {
    public static void main(String[] args) {
        // Singleton: Authenticate user
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticateUser("Balaji", "password");

        // Factory Method: Create vehicles
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.ride();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.ride();

        VehicleFactory scooterFactory = new ScooterFactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.ride();

        // Abstract Factory: Create payment methods
        PaymentFactory creditCardFactory = new CreditCardFactory();
        PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
        creditCard.pay();

        PaymentFactory payPalFactory = new PayPalFactory();
        PaymentMethod payPal = payPalFactory.createPaymentMethod();
        payPal.pay();
    }
}
