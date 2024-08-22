package com.Adapter;

public class AdvancedMusicPlayer extends MusicPlayer {

	public AdvancedMusicPlayer(MusicSourceAdapter musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("The advanced music player with extra features");
		musicSource.play();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		musicSource.stop();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		musicSource.pause();
	}

}
