package com.Adapter;

public class EqualizerDecorator extends MusicPlayerDecorator {

	public EqualizerDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play()
	{
		System.out.println("Applying equalizer settings");
		super.play();
	}
}
