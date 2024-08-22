package com.Adapter;

public class VolumeControlDecorator extends MusicPlayerDecorator {

	public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play()
	{
		System.out.println("Setting volume level.");
	}
}
