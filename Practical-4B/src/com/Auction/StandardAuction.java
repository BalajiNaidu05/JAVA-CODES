package com.Auction;
//StandardAuction.java
public class StandardAuction extends AuctionProcessTemplate {
 private Auction auction;

 public StandardAuction(Auction auction) {
     this.auction = auction;
 }

 @Override
 protected void startAuction() {
     System.out.println("Starting Standard Auction...");
     auction.startAuction();
 }

 @Override
 protected void takeBidds() {
     System.out.println("Taking bids in a standard auction...");
     // Here you could simulate some bidding process or logic
 }

 @Override
 protected void endAuction() {
     System.out.println("Ending Standard Auction...");
     auction.endAuction();
 }
}
