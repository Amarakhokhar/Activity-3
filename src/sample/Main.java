package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Label userName,password;
    private TextField userNameTF,passwordTF;
    private FlowPane root;
    private VBox labelVBox,textFieldVBox;
    @Override
    public void start(Stage primaryStage) throws Exception{
        userName=new Label("Username");
        password=new Label("Password");
        userNameTF=new TextField();
        userNameTF.setPromptText("Enter your username");
        passwordTF=new TextField();
        passwordTF.setPromptText("Enter your Password");
        labelVBox =new VBox(30,userName,password);
        textFieldVBox=new VBox(20,userNameTF,passwordTF);
        labelVBox.setPadding(new Insets(100,10,100,50));
        textFieldVBox.setPadding(new Insets(100,50,100,10));
        root=new FlowPane(labelVBox,textFieldVBox);
        primaryStage.setTitle("Activity 3");
        Scene S=new Scene(root);

        primaryStage.setScene(S);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
