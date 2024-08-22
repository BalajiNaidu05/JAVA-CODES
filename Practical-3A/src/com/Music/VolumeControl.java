package com.Music;

public class VolumeControl extends PlayerDecorator {

	public VolumeControl(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}
	public void play()
	{
		decoratedPlayer.play();
		System.out.println("Volume control adjusted...");
	}

}
