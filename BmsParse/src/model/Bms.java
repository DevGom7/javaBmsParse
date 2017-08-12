package model;

import java.util.Map;
import java.util.TreeMap;

public class Bms {
	
	String title;
	String artist;
	double bpm;
	Map<Integer, Note> noteMap;
	
	public Bms() {
		this.title = "";
		this.artist = "";
		this.noteMap = new TreeMap<Integer, Note>();
	}

	// get/set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Map<Integer, Note> getNoteMap() {
		return noteMap;
	}
	public void setNoteMap(Map<Integer, Note> noteMap) {
		this.noteMap = noteMap;
	}
	public double getBpm() {
		return bpm;
	}
	public void setBpm(double bpm) {
		this.bpm = bpm;
	}

	// add
	public void addNote(Note note) {
		noteMap.put(note.getChannel(), note);
	}

}