package com.Adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalFile localFile = new LocalFile();
		MusicSourceAdapter localFileAdapter = new LocalFileAdapter(localFile);
		MusicPlayer basicPlayer = new BasicMusicPlayer(localFileAdapter);
        MusicPlayer advancedPlayer = new AdvancedMusicPlayer(localFileAdapter);
        MusicPlayer playerWithEqualizer = new EqualizerDecorator(basicPlayer);
        MusicPlayer playerWithVolumeControl = new VolumeControlDecorator(advancedPlayer);
        
        System.out.println("===Basic Player===");
        basicPlayer.play();
        basicPlayer.stop();
        basicPlayer.pause();
        
        System.out.println("\n=== Advanced player with volume control ===");
        playerWithVolumeControl.play();
        playerWithVolumeControl.stop();
        
        System.out.println("\n=== Basic Player with equalizer ===");
        playerWithEqualizer.play();
        playerWithEqualizer.stop();
        
        OnlineStreamingService streamingService = new OnlineStreamingService();
        MusicSourceAdapter streamingServiceAdapter = new OnlineStreamingServiceAdapter(streamingService);
        MusicPlayer streamingPlayer = new BasicMusicPlayer(streamingServiceAdapter);
        
        System.out.println("\n=== Streaming Player ===");
        streamingPlayer.play();
        streamingPlayer.stop();
        streamingPlayer.pause();
        
        RadioStation radioStation = new RadioStation();
        MusicSourceAdapter radioStationAdapter = new RadioStationAdapter(radioStation);
        MusicPlayer radioPlayer = new BasicMusicPlayer(radioStationAdapter);
        
        System.out.println("\n=== Radio Player ===");
        radioPlayer.play();
        radioPlayer.stop();
        radioPlayer.pause();
        
        }

}
