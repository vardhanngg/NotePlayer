package edu.sssihl.midi.playback;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import edu.sssihl.midi.core.Note;
import edu.sssihl.midi.core.TrackPart;

import java.util.List;

public class MidiNotePlayer implements NotePlayer{
    //List<Note> track;
    MidiChannel[] channels;
    Synthesizer synth;
    //synth and channel 
    public MidiNotePlayer(){
    try{
    synth=MidiSystem.getSynthesizer();
    //track=new ArrayList<>();
    channels=synth.getChannels();
    synth.open();}
    catch(Exception e){
        e.printStackTrace();
    }
    }
    @Override
    public void programChange(int channel, int program){
        this.channels[channel].programChange(program);
    }
    public void noteOn(int channel, int pitch, int velocity){
        this.channels[channel].noteOn(pitch, velocity);
    }
    public void noteOff(int channel, int pitch){
        this.channels[channel].noteOff(pitch);
    } 
    public void sleepMillis(long ms) throws InterruptedException{
        Thread.sleep(ms);
    }
    public void close(){
        this.synth.close();
    }
    public void playtrack(TrackPart track){
        for(Note n:track.getnotes()){
            this.noteOn(n.channel, n.note,n.velocity);
            try{this.sleepMillis(n.duration);}
            catch(Exception e){
                e.printStackTrace();
            }
            this.noteOff(n.channel, n.note);
        }
    }
}