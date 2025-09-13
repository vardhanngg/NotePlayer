package edu.sssihl.midi.playback;
public interface NotePlayer{
    public void programChange(int channel, int program);
    public void noteOn(int channel, int pitch, int velocity);
    public void noteOff(int channel, int pitch);
    public void sleepMillis(long ms) throws InterruptedException;
    public void close();
}