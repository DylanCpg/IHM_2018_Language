package application.view.experimental;

import javafx.beans.property.*;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.IOException;

public class FieldExercise extends HBox {
    @FXML
    private Label question;
    @FXML
    private TextField field;
    @FXML
    private Text resultOk;
    @FXML
    private Text resultFaux;
    private StringProperty excepted;
    private BooleanProperty valid;
    
    
    public FieldExercise(){
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("field_exercise.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        this.valid = new SimpleBooleanProperty(false);
        this.excepted = new SimpleStringProperty("");
        
        try {
            fxmlLoader.load();
        } catch (IOException err) {
            throw new RuntimeException(err);
        }

        this.field.textProperty().addListener(e -> {
            this.valid.set(this.field.getText().equals(this.excepted.get()));
        });
        
        this.valid.addListener(e -> System.out.println("State of the field changed => " + e.toString()));
    }
    
    public boolean getValid() {
        return valid.get();
    }
    public BooleanProperty validProperty() {
        return valid;
    }

    public String getQuestion(){
        return this.question.getText();
    }
    public void setQuestion(String question){
        this.question.setText(question);
    }
    public StringProperty questionProperty(){
        return this.question.textProperty();
    }
    
    public String getAnswer(){
        return this.field.getText();
    }
    public void setAnswer(String answer){
        this.field.setText(answer);
    }
    public StringProperty fieldAnswer(){
        return this.field.textProperty();
    }

    public String getExcepted(){
        return this.excepted.get();
    }
    public void setExcepted(String excepted) {
        this.excepted.set(excepted);
    }
    public StringProperty exceptedProperty(){
        return this.excepted;
    }
    
    static class AnswerCheckEvent extends Event {
        static final EventType<AnswerCheckEvent> ANSWER_CHECK  = new EventType<>(Event.ANY, "ANSWER_CHECK");
        
        private int nbField = 0, fieldValid = 0;
        
        AnswerCheckEvent(){
            super(ANSWER_CHECK);
        }
    }
}
