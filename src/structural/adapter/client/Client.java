package structural.adapter.client;

import structural.adapter.mediaplayer.MediaPlayer;
import structural.adapter.mediaplayer.VLCPlayer;
import structural.adapter.mediaplayer.WindowPlayer;
import structural.adapter.mediaplayer.WindowPlayerAdapter;

public class Client {

    public static void run() {
        System.out.println("Client using VLCPlayer (direct implementation)");
        MediaPlayer vlcPlayer = new VLCPlayer();
        playMedia(vlcPlayer, "song.mp3");

        System.out.println("Client using WindowPlayer (via adapter)");
        // playMedia(windowPlayer, "movie.wmv"); wouldn't work
        WindowPlayer windowPlayer = new WindowPlayer();
        MediaPlayer adaptedPlayer = new WindowPlayerAdapter(windowPlayer);
        playMedia(adaptedPlayer, "video.avi");
    }

    private static void playMedia(MediaPlayer player, String fileName) {
        player.play(fileName);
    }
}
