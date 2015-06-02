package jfx.loginForm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
   private String truelog="admin";
   private String truepass="password";
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    Label info;

    public void log(ActionEvent event) throws IOException {
            if (login.getText().equals(truelog) && password.getText().equals(truepass)) {
                Parent homePage = FXMLLoader.load(getClass().getResource("start.fxml"));
                Scene homeScene = new Scene(homePage);
                Stage st = (Stage) ((Node) event.getSource()).getScene().getWindow();
                st.hide();
                st.setScene(homeScene);
                st.show();
            } else {
                info.setText("Sorry, try again!");
                login.clear();
                password.clear();
            }
    }
}

