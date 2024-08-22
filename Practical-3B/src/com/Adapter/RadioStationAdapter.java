package com.Adapter;
public class RadioStationAdapter implements MusicSourceAdapter {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void play() {
        radioStation.tuneIn();
    }

    @Override
    public void stop() {
        radioStation.tuneOut();
    }

    @Override
    public void pause() {
        System.out.println("Pausing is not supported for radio stations.");
    }
}
