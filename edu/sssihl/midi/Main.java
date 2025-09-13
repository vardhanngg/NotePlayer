package edu.sssihl.midi;
import java.util.List;
import javax.sound.midi.Track;
import edu.sssihl.midi.core.TrackPart;
import edu.sssihl.midi.playback.MidiNotePlayer;
import edu.sssihl.midi.core.Note;
public class Main{
    public static void main (String... args){
        MidiNotePlayer player=new MidiNotePlayer();
        Note n=new Note(60,100,1000,0);
        TrackPart track1=new TrackPart();
        track1.addnote(n);
        player.playtrack(track1);
        player.close();


    }

}