package com.Auction;
import java.util.*;

public class Auction implements Subject {
    private List<Observer> bidders;
    private String itemName;

    public Auction(String itemName) {
        this.itemName = itemName;
        this.bidders = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        bidders.add(observer);
        System.out.println("Observer added: " + ((Bidder) observer).getName());
    }

    @Override
    public void removeObserver(Observer observer) {
        bidders.remove(observer);
        System.out.println("Observer removed: " + ((Bidder) observer).getName());
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer bidder : bidders) {
            bidder.update(message);
        }
    }

    public void startAuction() {
        System.out.println("Auction started for item: " + itemName);
        notifyObservers("Auction started for item: " + itemName);
    }

    public void endAuction() {
        System.out.println("Auction ended for item: " + itemName);
        notifyObservers("Auction ended for item: " + itemName);
    }

    public void addItem(String item) {
        this.itemName = item;
        System.out.println("New item available for auction: " + itemName);
        notifyObservers("New item available for auction: " + itemName);
    }
}
