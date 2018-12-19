package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LexiqueVocabulaire {
	private ObservableList<LexiqueMot> vocab;
	
	public LexiqueVocabulaire(List<LexiqueMot> vocab){
		this.vocab = FXCollections.observableArrayList();
		this.vocab.addAll(vocab);
	}
	
	public ObservableList<LexiqueMot> getVocab(){
		return vocab;
	}
	
	public static LexiqueVocabulaire fromCSV(URL path) throws IOException{
		return LexiqueVocabulaire.fromCSV(path, ";");
	}
	
	public static LexiqueVocabulaire fromCSV(URL path, String sep) throws IOException{
		List<LexiqueMot> result = new ArrayList<>();
		try(
				InputStream is = path.openStream();
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr)
		){
			int i = 0;
			while(br.ready()) {
				i++;
				String[] split = br.readLine().split(sep);
				if(split.length != 2){
					System.err.println("Failed to load the line " + i + " of the csv file \"" + path.toExternalForm() + "\"");
					continue; // fixme exception to throws
				}
				result.add(new LexiqueMot(i, split[0], split[1]));
			}
		}
		
		return new LexiqueVocabulaire(result);
	}
	
	
	public static class LexiqueMot {
		private final IntegerProperty id;
		private final StringProperty mot;
		private final StringProperty trad;
		
		public LexiqueMot(int id, String mot, String trad){
			this.id = new SimpleIntegerProperty(id);
			this.mot = new SimpleStringProperty(mot);
			this.trad = new SimpleStringProperty(trad);
		}
		
		public int getId() {
			return id.get();
		}
		public IntegerProperty idProperty() {
			return id;
		}
		/*public void setId(int id) {
			this.id.set(id);
		}*/
		
		
		public String getMot(){
			return this.mot.get();
		}
		public void setMot(String mot){
			this.mot.set(mot);
		}
		public StringProperty motProperty(){
			return this.mot;
		}
		
		
		public String getTrad(){
			return this.trad.getValue();
		}
		public void setTrad(String trad){
			this.trad.set(trad);
		}
		public StringProperty tradProperty(){
			return this.trad;
		}
	}
}
