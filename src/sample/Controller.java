package sample;
import javafx.fxml.FXML;
import javax.swing.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller {

    @FXML
    public Button save;
    public Button cancel;
    public TextField field0;
    public TextField field1;
    public TextField field2;
    public String nome;
    public String nickname;
    public String via;

    public void save_click(){
        nome=field0.getText();
        nickname=field1.getText();
        via=field2.getText();
        System.out.println(nome+" "+nickname+" "+via);
    }
    public void cancel_click(){
        field0.setText(null);
        field1.setText(null);
        field2.setText(null);
    }

}
