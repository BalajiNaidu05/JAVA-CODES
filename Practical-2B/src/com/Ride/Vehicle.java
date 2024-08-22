package com.Ride;
//Abstract Vehicle class
abstract class Vehicle {
 public abstract void ride();
}

//Concrete Vehicle implementations
class Car extends Vehicle {
 @Override
 public void ride() {
     System.out.println("Riding a Car");
 }
}

class Bike extends Vehicle {
 @Override
 public void ride() {
     System.out.println("Riding a Bike");
 }
}

class Scooter extends Vehicle {
 @Override
 public void ride() {
     System.out.println("Riding a Scooter");
 }
}

//Abstract VehicleFactory class
abstract class VehicleFactory {
 public abstract Vehicle createVehicle();
}

//Concrete VehicleFactories
class CarFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Car();
 }
}

class BikeFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Bike();
 }
}

class ScooterFactory extends VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Scooter();
 }
}
