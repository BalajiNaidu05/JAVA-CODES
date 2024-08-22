package com.Auction;
//Main.java
public class Main {
 public static void main(String[] args) {
     Auction auction = new Auction("Vintage Car");

     Bidder bidder1 = new Bidder("Veera");
     Bidder bidder2 = new Bidder("Balaji");

     auction.registerObserver(bidder1);
     auction.registerObserver(bidder2);

     System.out.println("\n--- Conducting Standard Auction ---");
     AuctionProcessTemplate standardAuction = new StandardAuction(auction);
     standardAuction.conductAuction();

     System.out.println("\n--- Conducting Reserve Auction ---");
     auction.addItem("Antique Watch");
     AuctionProcessTemplate reserveAuction = new ReserveAuction(auction, 5000.0);
     reserveAuction.conductAuction();
 }
}
