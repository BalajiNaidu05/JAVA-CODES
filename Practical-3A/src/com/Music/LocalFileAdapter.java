package com.Music;

public class LocalFileAdapter implements MusicPlayer {
	private final MusicSource musicSource;
	
	public LocalFileAdapter(MusicSource musicSource)
	{
		this.musicSource = musicSource;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		musicSource.playMusic();
	}

}
