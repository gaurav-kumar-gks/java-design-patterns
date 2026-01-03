package structural.adapter.mediaplayer;

public class WindowPlayerAdapter implements MediaPlayer {

    private WindowPlayer windowPlayer;

    public WindowPlayerAdapter(WindowPlayer windowPlayer) {
        this.windowPlayer = windowPlayer;
    }

    @Override
    public void play(String fileName) {
        windowPlayer.playWindow(fileName);
    }
}
