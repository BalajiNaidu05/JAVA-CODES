package com.Music;

public class Equalizer extends PlayerDecorator {

	public Equalizer(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}
	public void play()
	{
		decoratedPlayer.play();
		System.out.println("Equalizer settings adjusted...");
	}
}
