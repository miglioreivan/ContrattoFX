package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Controller {

    @FXML
    public Pane input;
    public Pane stampa;
    public Button save;
    public Button cancel;
    public TextField field0;
    public TextField field1;
    public TextField field2;
    public Label labelNome;
    public Label labelNick;
    public Label labelVia;
    public Label labelNumero;
    public Label labelMensile;
    public Label labelAlMinuto;
    public Label labelCosto;

    public String nome;
    public String nickname;
    public String via;
    Random random = new Random();
    String numero;
    int a0 = 320;
    int b0 = 397;
    int c0 = ((b0-a0) + 1);
    int rand0 = random.nextInt(c0) + a0;
    int rand1 = random.nextInt(9999999);
    double costoMensile = 7.99;
    double costoMinuto = 0.05;




    public void save_click(){
        nome=field0.getText();
        nickname=field1.getText();
        via=field2.getText();

        stampa.setVisible(true);
        input.setVisible(false);

        labelNome.setText(nome);
        labelNick.setText(nickname);
        labelVia.setText(via);
        numero="+39 "+rand0+rand1;
        labelNumero.setText(numero);
        labelMensile.setText(costoMensile+"€");
        labelAlMinuto.setText(costoMinuto+"€");
    }

    public void cancel_click(){
        field0.setText(null);
        field1.setText(null);
        field2.setText(null);
    }

    public void stampa_nome(){
        labelNome.setText(nome);
    }

    public void stampa_nick(){
        labelNick.setText(nickname);
    }

    public void stampa_via(){
        labelVia.setText(via);
    }

    public void stampa_numero(){
        String numero;
        int a0 = 320;
        int b0 = 397;
        int c0 = ((b0-a0) + 1);
        int rand0 = random.nextInt(c0) + a0;
        int rand1 = random.nextInt(9999999);
        numero="+39 "+rand0+rand1;
        labelNumero.setText(numero);
    }



    public void close_click(){
        System.exit(0);
    }

}
