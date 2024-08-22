package com.Music;

public class OnlineStreamAdapter implements MusicPlayer {
	private final MusicSource musicSource;
	public OnlineStreamAdapter(MusicSource musicSource)
	{
		this.musicSource = musicSource;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		musicSource.playMusic();
	}

}
