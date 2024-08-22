package com.Adapter;

public class LocalFileAdapter implements MusicSourceAdapter {
    private LocalFile localFile;

    public LocalFileAdapter(LocalFile localFile) {
        this.localFile = localFile;
    }

    @Override
    public void play() {
        localFile.playFile();
    }

    @Override
    public void stop() {
        localFile.stopFile();
    }

    @Override
    public void pause() {
        localFile.pauseFile();
    }
}
