package com.Adapter;
public abstract class MusicPlayerDecorator extends MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.musicSource);
        this.decoratedPlayer = decoratedPlayer;
    }

    public void play() {
        decoratedPlayer.play();
    }

    public void stop() {
        decoratedPlayer.stop();
    }

    public void pause() {
        decoratedPlayer.pause();
    }
}