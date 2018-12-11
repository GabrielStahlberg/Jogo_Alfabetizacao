/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.SwingWorker;

/**
 *
 * @author gabrielstahlberg
 */
public class SoundBackground extends SwingWorker<Integer,Object>{

    @Override
    protected Integer doInBackground() throws Exception {
        URL som = MainWindow.class.getResource("Icons/startSound.wav");
        AudioClip sound = Applet.newAudioClip(som);
        sound.loop();
        
        return 1;
    }
    
}
