package timer;

import java.applet.Applet;
import java.applet.AudioClip;

public class Som {
    private Configuracoes settingsFrame = new Configuracoes();
    private static AudioClip clip = new AudioClip() {
        @Override
        public void play() {

        }

        @Override
        public void loop() {

        }

        @Override
        public void stop() {

        }
    };

    Som(String filename) {
        try {
            clip = Applet.newAudioClip(Som.class.getResource(filename));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    void play() {
        try {
            new Thread() {
                public void run() {
                    clip.play();
                }
            }.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    void loop() {
        try {
            new Thread() {
                public void run() {
                    clip.loop();
                }
            }.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void stop() {
        try {
            new Thread() {
                public void run() {
                    clip.stop();
                }
            }.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
