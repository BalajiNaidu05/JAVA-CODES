package com.Adapter;

public class BasicMusicPlayer extends MusicPlayer {

	public BasicMusicPlayer(MusicSourceAdapter musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Basic player: ");
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
