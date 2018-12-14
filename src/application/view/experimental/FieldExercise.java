package application.view.experimental;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
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
    private Property<State> state;


    public enum State{
        Unknown,
        Right,
        Wrong;
    }

    
    public FieldExercise(){
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("field_exercice.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        this.state = new SimpleObjectProperty<>(State.Unknown);
        this.excepted = new SimpleStringProperty("");
        
        try {
            fxmlLoader.load();
        } catch (IOException err) {
            throw new RuntimeException(err);
        }

        this.field.textProperty().addListener(e -> {
            this.state.setValue(State.Unknown);
        });
    }

    public State getState() {
        return this.state.getValue();
    }
    public Property<State> stateProperty() {
        return state;
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

    // fixme proper event
    public void TestAnswer(ActionEvent event){
        if(this.excepted.get().equals(this.field.getText())){
            this.resultOk.setOpacity(1);
            this.resultFaux.setOpacity(0);
            state.setValue(State.Right);
        }else{
            this.resultOk.setOpacity(0);
            this.resultFaux.setOpacity(1);
            state.setValue(State.Wrong);
        }
    }
}
