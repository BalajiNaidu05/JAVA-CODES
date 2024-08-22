package com.Ride;
//Abstract PaymentMethod class
abstract class PaymentMethod {
 public abstract void pay();
}

//Concrete PaymentMethod implementations
class CreditCard extends PaymentMethod {
 @Override
 public void pay() {
     System.out.println("Paying with Credit Card");
 }
}

class PayPal extends PaymentMethod {
 @Override
 public void pay() {
     System.out.println("Paying with PayPal");
 }
}

//Abstract PaymentFactory class
abstract class PaymentFactory {
 public abstract PaymentMethod createPaymentMethod();
}

//Concrete PaymentFactories
class CreditCardFactory extends PaymentFactory {
 @Override
 public PaymentMethod createPaymentMethod() {
     return new CreditCard();
 }
}

class PayPalFactory extends PaymentFactory {
 @Override
 public PaymentMethod createPaymentMethod() {
     return new PayPal();
 }
}
