package com.Auction;

public abstract class AuctionProcessTemplate {
	public final void conductAuction ()
	{
		startAuction();
		takeBidds();
		endAuction();
	}
	protected abstract void startAuction();
	protected abstract void takeBidds();
	protected abstract void endAuction();
}
