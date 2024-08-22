package com.Auction;
//ReserveAuction.java
public class ReserveAuction extends AuctionProcessTemplate {
 private Auction auction;
 private double reservePrice;

 public ReserveAuction(Auction auction, double reservePrice) {
     this.auction = auction;
     this.reservePrice = reservePrice;
 }

 @Override
 protected void startAuction() {
     System.out.println("Starting Reserve Auction with reserve price: " + reservePrice);
     auction.startAuction();
 }

 @Override
 protected void takeBidds() {
     System.out.println("Taking bids in a reserve auction...");
     // Here you could simulate some bidding process with reserve price logic
 }

 @Override
 protected void endAuction() {
     System.out.println("Ending Reserve Auction...");
     auction.endAuction();
 }
}
