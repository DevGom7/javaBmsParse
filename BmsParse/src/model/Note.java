package model;

public class Note {

	private int bar;			// 마디
    private int channel;		// 채널
    private String noteData;	// 노트 정보
    
    public Note(int bar, int channel, String noteData) {
        this.bar = bar;
        this.channel = channel;
        this.noteData = noteData;
    }

	public int getBar() {
		return bar;
	}
	public void setBar(int bar) {
		this.bar = bar;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getNoteData() {
		return noteData;
	}
	public void setNoteData(String noteData) {
		this.noteData = noteData;
	}
	
}