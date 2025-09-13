package edu.sssihl.midi.core;
import java.util.List;
import java.util.ArrayList;
public class TrackPart{
    List<Note> l=new ArrayList<>();
    public void addnote(Note note){
        l.add(note);
    }
    public List<Note> getnotes(){
        return l;
    }
}
