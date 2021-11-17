package sons;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class ExecutarSom2 {

    private boolean isTocando;

    private URL recurso;
    private AudioClip som;

    public ExecutarSom2(boolean isTocando, String audio) {
        this.isTocando = isTocando;
        this.recurso = getClass().getResource(audio + ".wav");
        this.som = Applet.newAudioClip(recurso);
    }

    public boolean isIsTocando() {
        return isTocando;
    }

    public void setIsTocando(boolean isTocando) {
        this.isTocando = isTocando;
    }

    public void tocar() {
        if (isTocando) {
            som.stop();
            isTocando = false;
        } else {
            som.play();
            isTocando = true;
        }

    }

}
