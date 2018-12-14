package application.model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LexiqueVocabulaire {
	private final StringProperty mot;
	private final StringProperty trad;
	
	public LexiqueVocabulaire(String mot, String trad){
		this.mot = new SimpleStringProperty(mot);
		this.trad = new SimpleStringProperty(trad);
	}
	
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
	
	// fixme no static
	public static ObservableList<LexiqueVocabulaire> getVocaNombre(){
		ObservableList<LexiqueVocabulaire> voca = FXCollections.observableArrayList();
		voca.add(new LexiqueVocabulaire("un", "one"));
		voca.add(new LexiqueVocabulaire("deux", "two"));
		voca.add(new LexiqueVocabulaire("trois", "three"));
		voca.add(new LexiqueVocabulaire("quatre", "four"));
		voca.add(new LexiqueVocabulaire("cinq", "five"));
		return voca;
	}
}
