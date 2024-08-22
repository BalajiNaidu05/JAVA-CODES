package com.Music;

public class RadioAdapter implements MusicPlayer{
	private final MusicSource musicSource;
	
	public RadioAdapter(MusicSource musicSource)
	{
		this.musicSource = musicSource;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		musicSource.playMusic();
	}

}
