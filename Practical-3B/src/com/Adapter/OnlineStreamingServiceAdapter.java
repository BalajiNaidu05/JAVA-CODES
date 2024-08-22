package com.Adapter;

public class OnlineStreamingServiceAdapter implements MusicSourceAdapter {
    private OnlineStreamingService StreamingService;

    public OnlineStreamingServiceAdapter(OnlineStreamingService StreamingService) {
        this.StreamingService = StreamingService;
    }

    @Override
    public void play() {
        StreamingService.startStreaming();
    }

	@Override
    public void stop() {
        StreamingService.stopStreaming();
    }

    @Override
    public void pause() {
        StreamingService.pauseStreaming();
    }
}
