package game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Bms;
import model.Note;

public class BmsLoader {
	
	private static List<String> bmsLineDataList;
	private static Bms bms;
	
	public static Bms load(String fileName) {
		parse(fileName);
		process();
		
		if (bms != null) {
			System.out.println("* BMS 로딩 완료 : " + bms.getTitle());
		}
		
		return bms;
	}

	private static void parse(String fileName) {
		
		bmsLineDataList = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String str = "";
			while ((str = br.readLine()) != null) {
				bmsLineDataList.add(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void process() {
		
		bms = new Bms();
		
		for (String line : bmsLineDataList) {
			if (line.startsWith("#")) {
				String[] data = line.split(" ");
				
				// 데이터 섹션이 아니면서 헤더 데이터가 없는 경우에는 건너 뜀.
				if(data[0].indexOf(":") == -1 && data.length == 1) {
					continue;
				}

				// 헤더 섹션
                if(data[0].equalsIgnoreCase("#TITLE")){
                	bms.setTitle(data[1]);
                } else if(data[0].equalsIgnoreCase("#ARTIST")){
                	bms.setArtist(data[1]);
                } else if(data[0].equalsIgnoreCase("#BPM")){
                	bms.setBpm(Double.valueOf(data[1]));
                } else if(data[0].equalsIgnoreCase("#PLAYER")){
                } else if(data[0].equalsIgnoreCase("#GENRE")){
                } else if(data[0].equalsIgnoreCase("#PLAYLEVEL")){
                } else if(data[0].equalsIgnoreCase("#RANK")){
                } else if(data[0].equalsIgnoreCase("#TOTAL")){
                } else if(data[0].equalsIgnoreCase("#VOLWAV")){
                } else if(data[0].equalsIgnoreCase("#MIDIFILE")){
                } else if(data[0].equalsIgnoreCase("#WAV")){
                } else if(data[0].equalsIgnoreCase("#BMP")){
                } else if(data[0].equalsIgnoreCase("#STAGEFILE")){
                } else if(data[0].equalsIgnoreCase("#VIDEOFILE")){
                } else if(data[0].equalsIgnoreCase("#BGA")){
                } else if(data[0].equalsIgnoreCase("#STOP")){
                } else if(data[0].equalsIgnoreCase("#LNTYPE")){
                } else if(data[0].equalsIgnoreCase("#LNOBJ")){
                } else {
                	// 위의 경우에 모두 해당하지 않을 경우, 데이터 섹션
                    int bar = Integer.parseInt( data[0].substring(1, 4) );
                    int channel = Integer.parseInt( data[0].substring(4, 6) );
                    String noteData = data[0].substring(7);
                    Note note = new Note(bar, channel, noteData);
                    bms.addNote(note);
                }
			}
		}
	}
}
