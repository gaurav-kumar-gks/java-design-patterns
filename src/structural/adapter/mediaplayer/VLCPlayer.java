package structural.adapter.mediaplayer;

public class VLCPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("VLC Player: Playing " + fileName);
    }
}
