package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Shansky.app");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
        primaryStage.setResizable(false);

    }



    public static void main(String[] args) {
        CDatabaseComm db = new CDatabaseComm("test.db");
        Session session = new Session();
        Session.CurrentSession = session;
        launch(args);
    }

}