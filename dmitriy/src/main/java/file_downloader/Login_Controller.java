package file_downloader;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

/**
 * Created by Дима on 03.06.2015.
 */
public class Login_Controller {
    @FXML
    static
    TextField setLogin;
    @FXML
    static
    PasswordField setPassword;
    @FXML
    static
    Label info;

    public static String getLogin(){ return setLogin.getText();}

    public static String getPassword() { return setPassword.getText();}


    public void checkin(ActionEvent e) throws IOException {
        try{
            if (!getLogin().isEmpty()
                    && !getPassword().isEmpty()){
                Stage stage = new Stage();
                Parent root2 = FXMLLoader.load(getClass().getResource("FileD.fxml"));
                stage.setTitle("Files Downloader");
                stage.setScene(new Scene(root2, 300, 350));
                stage.show();
            }
            else {
                info.setText("Login or Password field is empty");
            }
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
    }

}
