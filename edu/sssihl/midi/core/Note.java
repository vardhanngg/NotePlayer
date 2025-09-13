package edu.sssihl.midi.core;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
public class Note{
    public int note;
    public int velocity;
    public int channel;
    public long duration;
    public Note(int note,int velocity,long duration,int channel){
        this.note=note;
        this.velocity=velocity;
        this.duration=duration;
        this.channel=channel;
    }
}//getnote get velocity get duration get channekl 