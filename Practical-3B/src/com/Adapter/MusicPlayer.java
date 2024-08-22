package com.Adapter;

public abstract class MusicPlayer {
protected MusicSourceAdapter musicSource;

public MusicPlayer(MusicSourceAdapter musicSource)
{
	this.musicSource = musicSource;
}
public abstract void play();
public abstract void stop();
public abstract void pause();
}
