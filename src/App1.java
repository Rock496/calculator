
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
// javafx.scene.paint.Color;
import javafx.stage.*;

public class App1 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'start'");
       // try {
       FXMLLoader loader=new FXMLLoader(getClass().getResource("mainif.fxml"));
        //Group root=new Group();
        Scene sc=new Scene(loader.load());
        

        sc.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/icon.png")));
        ((scenecontrol)loader.getController()).init(stage);
        stage.setScene(sc);
        stage.show();
      //} catch (Exception e) {
        //TODO: handle exception
       // e.printStackTrace();
      //}
    }

  public void run(){
    launch();
  }
}
