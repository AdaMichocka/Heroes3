package pl.sdk.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

    public Start() {

    }

    @Override
    public void start(Stage aStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getClassLoader().getResource("fxml/battleMap.fxml")));

        aStage.setScene(scene);
        aStage.show();
    }
}
